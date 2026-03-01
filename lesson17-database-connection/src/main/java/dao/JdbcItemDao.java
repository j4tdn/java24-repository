package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.Item;
import dao.base.GenericDao;

public class JdbcItemDao extends GenericDao<Item> implements ItemDao {
	
	private static final String GET_ALL_ITEMS = ""
			+ "SELECT *\n"
			+ "  FROM T01_ITEM t01\n"
			+ "  JOIN T07_ITEM_GROUP t07\n"
			+ "    ON t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID";
	
	@Override
	public List<Item> getAll() {
		return getAll(GET_ALL_ITEMS, rs -> {
			Item item = null;
			try {
				item = transform(rs);
				item.setGroup(JdbcItemGroupDao.transform(rs));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return item;
		});

	}
	
	public static Item transform(ResultSet rs) throws SQLException {
		return new Item(rs.getInt("C01_ITEM_ID"), rs.getString("C01_ITEM_NAME"), rs.getString("C01_ITEM_COLOR"),
				rs.getInt("C01_REF_ITEM_ID"));
	}
}
