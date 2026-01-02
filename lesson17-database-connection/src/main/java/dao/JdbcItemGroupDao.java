package dao;

import bean.ItemGroup;
import connection.DbConnection;
import dao.base.GenericDao;
import utils.IoUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao  {

    private static final int BATCH_SIZE = 100;

    private Connection connection;

    public JdbcItemGroupDao() {
        connection = DbConnection.getConnection();
    }

    private static final String GET_ALL_ITEM_GROUPS = "" +
            "select * from t07_item_group";

    private static final String GET_ITEM_GROUPS_BY_ID = "" +
            "select * from t07_item_group where C07_ITEM_GROUP_ID = ?"; // dấu hỏi tượng trưng cho param

    private static final String INSERT_ITEM_GROUP = ""
            + "insert into t07_item_group (C07_ITEM_GROUP_NAME, C07_STATUS) \n"
            + "values (?, ?)";

    private static final String UPDATE_ITEM_GROUP = ""
            + "update t07_item_group " +
            "Set C07_ITEM_GROUP_NAME = ?, \n"
            + "C07_STATUS = ?\n" +
            "where c07_item_group_id = ?";

    private static final String GET_ITEM_GROUPS_BY_NAME = "" +
            "select * from t07_item_group where C07_ITEM_GROUP_NAME = ?";

    @Override
    public List<ItemGroup> getAll() {
        final var result = new ArrayList<ItemGroup>();
        // Statment Dùng cho lệnh hoàn chỉnh, chạy phát ăn luôn
        try {
            st = connection.createStatement();
            rs = st.executeQuery(GET_ALL_ITEM_GROUPS);
            while (rs.next()) {
                ItemGroup group = new ItemGroup(rs.getInt("C07_ITEM_GROUP_ID"),
                        rs.getString("C07_ITEM_GROUP_NAME"),
                        rs.getBoolean("C07_STATUS")
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
    public ItemGroup get(int id) {
        final String sql = "select * from t07_item_group where C07_ITEM_GROUP_ID = " + id;
        ItemGroup result = null;
        // PreparedStatement Dùng cho thằng nào cần set tham số
        try {
            pst = connection.prepareStatement(GET_ITEM_GROUPS_BY_ID);
            pst.setInt(1, id);
            // Tìm dấu hỏi đầu tiền rồi set, set Int tức là kiểu dữ liệu của nó trong db
            rs = pst.executeQuery(sql);
            if (rs.next()) {
                result = new ItemGroup(rs.getInt("C07_ITEM_GROUP_ID"),
                        rs.getString("C07_ITEM_GROUP_NAME"),
                        rs.getBoolean("C07_STATUS")
                );
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return result;
    }

    @Override
    public void save(ItemGroup itemGroup) {
        try {
            pst = connection.prepareStatement(INSERT_ITEM_GROUP);
            pst.setString(1, itemGroup.getName());
            pst.setBoolean(2, itemGroup.getStatus());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(pst);
        }
    }

    @Override
    public void update(ItemGroup itemGroup) {
        excuteUpdate(UPDATE_ITEM_GROUP, pst ->
                {try {
                    pst = connection.prepareStatement(UPDATE_ITEM_GROUP);
                    pst.setString(1, itemGroup.getName());
                    pst.setBoolean(2, itemGroup.getStatus());
                    pst.setInt(3, itemGroup.getId());
                    pst.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    IoUtils.close(pst);
                }
                }
                , itemGroup);
    }

    @Override
    public void saveGroups(List<ItemGroup> itemGroup) {
        try {
            pst = connection.prepareStatement(INSERT_ITEM_GROUP);
            int counter = 0;
            for (ItemGroup group : itemGroup) {
                pst.setString(1, group.getName());
                pst.setBoolean(2, group.getStatus());
                pst.addBatch();
                if (++counter % BATCH_SIZE == 0){
                    pst.executeBatch();
                }
            }
            pst.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(pst);
        }
    }

    @Override
    public ItemGroup getByName(String name) {
        ItemGroup result = null;
        // PreparedStatement Dùng cho thằng nào cần set tham số
        try {
            pst = connection.prepareStatement(GET_ITEM_GROUPS_BY_NAME);
            pst.setString(1, name);
            // Tìm dấu hỏi đầu tiền rồi set, set Int tức là kiểu dữ liệu của nó trong db
            rs = pst.executeQuery();
            if (rs.next()) {
                result = new ItemGroup(rs.getInt("C07_ITEM_GROUP_ID"),
                        rs.getString("C07_ITEM_GROUP_NAME"),
                        rs.getBoolean("C07_STATUS")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    }