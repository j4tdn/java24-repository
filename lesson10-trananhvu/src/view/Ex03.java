package view;

import bean.Item;
import utils.ArrayUtils;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        Item[] items = new Item[]{
                new Item(1, "A", 25, 101),
                new Item(2, "B", 90, 102),
                new Item(3, "C", 88, 102),
                new Item(4, "D", 40, 101),
                new Item(5, "E", 60, 102),
                new Item(6, "F", 18, 101),
                new Item(7, "G", 100, 103),
                new Item(8, "H", 200, 103),
                new Item(9, "I", 70, 104),
                new Item(10, "J", 40, 105),
        };

        int[] idStores = filterIdStores(items);
        System.out.println(Arrays.toString(idStores));

        for (int idStore : idStores) {
            System.out.println("Mat hang co gia cao nhat cua cua hang " + idStore + " la:");
            System.out.println(getItemOfStoreByPrice(items, idStore));
        }

    }

    private static int[] filterIdStores(Item[] items) {
        int[] id = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            id[i] = items[i].getStoreId();
        }

        id = ArrayUtils.cleanArray(id);

        return id;
    }

    private static Item getItemOfStoreByPrice(Item[] items, int idStore) {
        Item[] res = new Item[items.length];
        int count = 0;

        for (Item item : items) {
            if (item.getStoreId() == idStore) {
                res[count++] = item;
            }
        }

        res = Arrays.copyOf(res, count);

        return ArrayUtils.getHighestPrice(res);
    }

}
