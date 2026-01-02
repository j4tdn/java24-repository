package service;

import bean.Item;
import dao.ItemsDao;
import dao.JdbcItemGroupDao;
import dao.JdbcItemsDao;

import java.util.List;

public class ItemServiceImp implements ItemService {
    private ItemsDao itemDao;
    public ItemServiceImp() {
        itemDao = new JdbcItemsDao();
    }
    @Override
    public List<Item> getAll() {
        return itemDao.getAll();
    }
}
