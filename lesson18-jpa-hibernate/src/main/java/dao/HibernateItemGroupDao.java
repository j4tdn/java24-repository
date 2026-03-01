package dao;

import dao.base.GenericDao;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import persistence.ItemGroup;

import java.util.List;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {

//    private static final String Q_GET_ALL = ""
//            + "SELECT * FROM T07_ITEM_GROUP";

//    private static final String Q_GET_ALL = ""
//            + "SELECT ig FROM ItemGroup ig";

    private static final String PARAM_ITEM_GROUP_NAME = "itemGroupName";
    private static final String SQL_PARAM_ITEM_GROUP_NAME = ":" + PARAM_ITEM_GROUP_NAME;

    private static final String Q_GET_GROUP_BY_NAME = ""
            + "SELECT * FROM T07_ITEM_GROUP "
            + "WHERE C07_ITEM_GROUP_NAME = " + SQL_PARAM_ITEM_GROUP_NAME;


    @Override
    public List<ItemGroup> getAll() {
        return openSession().createNamedQuery(ItemGroup.Q_GET_ALL, ItemGroup.class).getResultList();
    }

    @Override
    public ItemGroup get(Integer id) {
        return openSession().find(ItemGroup.class, id);
    }

    @Override
    public ItemGroup get(String name) {
        return  openSession().createNativeQuery(Q_GET_GROUP_BY_NAME, ItemGroup.class)
                .setParameter(PARAM_ITEM_GROUP_NAME, name)
                .uniqueResult();
    }
}
