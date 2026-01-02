package service;

import bean.Item;
import dao.ItemDao;
import dao.JdbcItemDao;

import java.util.List;

public class ItemServiceImp implements ItemService {
    private ItemDao itemDao;
    public ItemServiceImp() {
        itemDao = new JdbcItemDao();
    }
    @Override
    public List<Item> getAll() {
        return itemDao.getAll();
    }
}
