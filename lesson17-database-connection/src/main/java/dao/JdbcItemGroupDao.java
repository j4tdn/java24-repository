package dao;

import bean.Item;
import bean.ItemGroup;
import bean.ItemGroupAndItem;
import bean.ListGroups;
import connection.DbConnection;
import dao.base.GenericDao;
import utils.IoUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcItemGroupDao implements ItemGroupDao {
    private Connection connection;
    private static final Integer BATCH_SIZE = 50;

    private static final String GET_ALL_ITEM_GROUPS = "SELECT * FROM t07_item_group";

    private static final String GET_BY_ID = "SELECT * FROM t07_item_group WHERE C07_ITEM_GROUP_ID = ?";

    private static final String GET_BY_NAME = "SELECT * FROM t07_item_group WHERE C07_ITEM_GROUP_NAME=?";

    private static final String GET_ALL_ITEM_GROUPS_AND_ITEM = "SELECT * FROM t01_item JOIN t07_item_group ON C01_ITEM_GROUP_ID = C07_ITEM_GROUP_ID";

    private static final String GET_LIST_GROUPS = "SELECT\n" +
            "g.C07_ITEM_GROUP_ID  AS itemGroupId,\n" +
            "g.C07_ITEM_GROUP_NAME AS itemGroupName,\n" +
            "COUNT(i.C01_ITEM_ID)  AS sumOfItems\n" +
            "FROM t07_item_group g\n" +
            "LEFT JOIN t01_item i\n" +
            "ON g.C07_ITEM_GROUP_ID = i.C01_ITEM_GROUP_ID\n" +
            "GROUP BY g.C07_ITEM_GROUP_ID, g.C07_ITEM_GROUP_NAME";

    private static final String GET_TOP_ITEM = "SELECT\n" +
            "C01_ITEM_NAME AS name,\n" +
            "COUNT(*) AS quantity\n" +
            "FROM t01_item\n" +
            "GROUP BY C01_ITEM_NAME\n" +
            "HAVING COUNT(*) = (\n" +
            "SELECT MAX(SoLuong)\n" +
            "FROM (\n" +
            "SELECT COUNT(*) AS SoLuong\n" +
            "FROM t01_item\n" +
            " GROUP BY C01_ITEM_NAME\n" +
            ") t\n" +
            ")";

    private static final String CREATE_ITEM_GROUP = "INSERT INTO t07_item_group(C07_ITEM_GROUP_NAME, C07_STATUS) VALUES(?,?)";

    private static final String UPDATE_ITEM_GROUP = "UPDATE t07_item_group SET C07_ITEM_GROUP_NAME=? SET C07_STATUS=? WHERE C07_ITEM_GROUP_ID=?";

    public JdbcItemGroupDao() {
        connection = DbConnection.getConnection();
    }

    @Override
    public List<ItemGroup> getAll() {
        final var result = new ArrayList<ItemGroup>();

        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(GET_ALL_ITEM_GROUPS);
            while (rs.next()) {
                ItemGroup group = new ItemGroup(rs.getInt("C07_ITEM_GROUP_ID"),
                        rs.getString("C07_ITEM_GROUP_NAME"),
                        rs.getInt("C07_STATUS")
                );
                result.add(group);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(rs, st);
        }

        return result;
    }

    @Override
    public ItemGroup getById(Integer id) {
        ItemGroup result = null;
        Statement st = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                result = new ItemGroup(rs.getInt("C07_ITEM_GROUP_ID"),
                        rs.getString("C07_ITEM_GROUP_NAME"),
                        rs.getInt("C07_STATUS")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(rs, st);
        }

        return result;
    }

    @Override
    public void save(ItemGroup itemGroup) {
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(CREATE_ITEM_GROUP);
            ps.setString(1, itemGroup.getName());
            ps.setInt(2, itemGroup.getStatus());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(ps);
        }
    }

    @Override
    public void update(ItemGroup itemGroup) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(UPDATE_ITEM_GROUP);
            ps.setString(1, itemGroup.getName());
            ps.setInt(2, itemGroup.getStatus());
            ps.setInt(3, itemGroup.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(ps);
        }
    }

    @Override
    public void saveGroups(List<ItemGroup> itemGroups) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(CREATE_ITEM_GROUP);
            int counter = 0;
            for (ItemGroup group : itemGroups) {
                ps.setString(1, group.getName());
                ps.setInt(2, group.getStatus());
                if (++counter % BATCH_SIZE == 0) {
                    ps.executeBatch();
                }
                ps.addBatch();
            }
            ps.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(ps);
        }
    }

    @Override
    public ItemGroup getByName(String name) {
        ItemGroup result = null;
        Statement st = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement(GET_BY_NAME);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                result = new ItemGroup(rs.getInt("C07_ITEM_GROUP_ID"),
                        rs.getString("C07_ITEM_GROUP_NAME"),
                        rs.getInt("C07_STATUS")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(rs, st);
        }

        return result;
    }

    @Override
    public List<ItemGroupAndItem> getAllItemGroups() {
        final var result = new ArrayList<ItemGroupAndItem>();

        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(GET_ALL_ITEM_GROUPS_AND_ITEM);
            while (rs.next()) {
                ItemGroupAndItem group = new ItemGroupAndItem(rs.getInt("C07_ITEM_GROUP_ID"),
                        rs.getString("C07_ITEM_GROUP_NAME"),
                        rs.getInt("C07_STATUS"),
                        rs.getInt("C01_ITEM_ID"),
                        rs.getString("C01_ITEM_Name"),
                        rs.getString("C01_COLOR")

                );
                result.add(group);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(rs, st);
        }

        return result;
    }

    @Override
    public List<ListGroups> getAllListGroups() {
        final var result = new ArrayList<ListGroups>();

        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(GET_LIST_GROUPS);
            while (rs.next()) {
                ListGroups group = new ListGroups(rs.getInt("itemGroupId"),
                        rs.getString("itemGroupName"),
                        rs.getInt("sumOfItems")
                );
                result.add(group);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(rs, st);
        }

        return result;
    }

    @Override
    public List<Item> getTopItems() {
        final var result = new ArrayList<Item>();

        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(GET_TOP_ITEM);
            while (rs.next()) {
                Item item = new Item(rs.getString("name"),
                        rs.getInt("quantity")
                );
                result.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(rs, st);
        }

        return result;
    }
}

