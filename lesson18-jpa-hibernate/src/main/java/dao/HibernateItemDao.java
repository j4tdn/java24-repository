package dao;

import dao.base.GenericDao;
import persistence.Item;

import java.util.List;

public class HibernateItemDao extends GenericDao implements ItemDao {
    private static final String Q_GET_ALL = ""
            + "SELECT * FROM T01_ITEM";

    @Override
    public List<Item> getAll() {
        return openSession().createNativeQuery(Q_GET_ALL, Item.class).getResultList();
    }
}
