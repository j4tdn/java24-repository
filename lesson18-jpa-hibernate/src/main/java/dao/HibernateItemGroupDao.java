package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import dto.ItemGroupDto;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {
	
	private static final String PARAM_ITEM_GROUP_NAME = "itemGroupName";
	
	private static final String SQL_PARAM_ITEM_GROUP_NAME = ":" + PARAM_ITEM_GROUP_NAME;
	
	/* native query
	private static final String Q_GET_ALL = ""
			+ "SELECT * FROM T07_ITEM_GROUP"; */
	
	/* jakarta persistence query
	private static final String Q_GET_ALL = ""
			+ "FROM ItemGroup"; */
	
	private static final String Q_GET_GROUP_BY_NAME = ""
			+ "SELECT * \n"
			+ "  FROM T07_ITEM_GROUP\n"
			+ " WHERE C07_ITEM_GROUP_NAME = " + SQL_PARAM_ITEM_GROUP_NAME;
	
	private static final String GET_ITEM_GROUP_DETAILS = ""
			+ "SELECT t07.C07_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "       t07.C07_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       SUM(t03.C03_AMOUNT) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + ",\n"
			+ "       GROUP_CONCAT(concat(t01.C01_ITEM_NAME, '-', t03.C03_SIZE_ID, '-', t03.C03_AMOUNT)) " + ItemGroupDto.PROP_ITEM_DETAILS + "\n"
			+ "  FROM t07_item_group t07\n"
			+ "  JOIN t01_item t01\n"
			+ "    ON t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID\n"
			+ "  JOIN t03_item_detail t03\n"
			+ "    ON t03.C03_ITEM_ID = t01.C01_ITEM_ID\n"
			+ " GROUP BY t07.C07_ITEM_GROUP_ID";
	
	@Override
	public List<ItemGroup> getAll() {
		// return openSession().createNativeQuery(Q_GET_ALL, ItemGroup.class).getResultList();
		// return openSession().createQuery(Q_GET_ALL, ItemGroup.class).getResultList();
		return openSession().createNamedQuery(ItemGroup.Q_GET_ALL, ItemGroup.class).getResultList();
	}
	
	@Override
	public ItemGroup get(Integer id) {
		// find: chỉ hỗ trợ khi param là PK của Entity
		return openSession().find(ItemGroup.class, id);
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return openSession().createNativeQuery(GET_ITEM_GROUP_DETAILS)
				.addScalar(ItemGroupDto.PROP_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDto.PROP_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDto.PROP_ITEM_DETAILS, StandardBasicTypes.STRING)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
				.getResultList();
	}
	
	// uniqueResult --> return single result or null of not exists
	//              --> throw exception if return more than one matching result
	
	// getSingleResult --> return single result if exists
	//                 --> throw exception if return more than one matching result || non matching result
	
	@Override
	public ItemGroup get(String name) {
		return openSession().createNativeQuery(Q_GET_GROUP_BY_NAME, ItemGroup.class)
				.setParameter(PARAM_ITEM_GROUP_NAME, name, StandardBasicTypes.STRING)
				.uniqueResult();
	}
	
	@Override
	public void save(ItemGroup group) {
		System.out.println("LOGGING >> persist group ... " + group);
		executeUpdate(session -> session.persist(group));
	}
	
	@Override
	public void testHibernateCache() {
		Session session1 = openSession(); // 8 12 16
		Session session2 = openSession();
		
		var group1 = session1.find(ItemGroup.class, 8); // from database
		System.out.println("group1: " + group1);
		
		System.out.println("\n");
		
		var group2 = session1.find(ItemGroup.class, 12); // from database
		System.out.println("group2: " + group2);
		
		System.out.println("\n");
		
		var group31 = session1.find(ItemGroup.class, 8); // from cache of session1(1st)
		System.out.println("group31: " + group31);
		
		System.out.println("\n");
		
		var group32 = session2.find(ItemGroup.class, 8); // from cache of session1(2nd)
		System.out.println("group32: " + group32);
		
		System.out.println("\n");
		
		var group4 = session1.find(ItemGroup.class, 16); // from database
		System.out.println("group4: " + group4);
	}
}
