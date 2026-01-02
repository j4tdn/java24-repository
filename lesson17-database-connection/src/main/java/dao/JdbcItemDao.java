package dao;

import bean.ItemGroup;
import bean.Item;
import connection.DbConnection;
import dao.base.GenericDao;
import utils.IoUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcItemDao extends GenericDao implements ItemDao {
    private static final int BATCH_SIZE = 100;

    private Connection connection;

    public JdbcItemDao() {
        connection = DbConnection.getConnection();
    }

    private static final String GET_ALL_ITEM = "" +
            "select * from t01_item t01\n" +
            "join t07_item_group t07 on t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID";

    @Override
    public List<Item> getAll() {
        final var result = new ArrayList<Item>();
        try {
            pst = connection.prepareStatement(GET_ALL_ITEM);
            rs = pst.executeQuery();
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("C01_ITEM_ID"));
                item.setName(rs.getString("C01_ITEM_NAME"));
                item.setItemGroupId(rs.getInt("C01_ITEM_GROUP_ID"));
                item.setColor(rs.getString("C01_COLOR"));

                ItemGroup group = new ItemGroup();
                group.setId(rs.getInt("C07_ITEM_GROUP_ID"));
                group.setName(rs.getString("C07_ITEM_GROUP_NAME"));
                group.setStatus(rs.getBoolean("C07_STATUS"));

                item.setItemGroup(group);

                result.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(pst);
        }
        return result;
    }
}
