package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.Item;

public class HibernateItemDao extends GenericDao implements ItemDao {
	
	private static final String Q_GET_ALL = ""
			+ "SELECT C01_ITEM_ID,\n"
			+ "       C01_ITEM_NAME,\n"
			+ "       C01_COLOR,\n"
			+ "		  C01_ITEM_GROUP_ID\n"
			+ "  FROM T01_ITEM";
	
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(Q_GET_ALL, Item.class).getResultList();
	}
	
}
