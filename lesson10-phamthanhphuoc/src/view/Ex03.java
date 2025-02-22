package view;

import bean.Item;
import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        Item[] items = new Item[]{
                new Item(1, "A", 25.0, 101),
                new Item(2, "B", 90.0, 102),
                new Item(3, "C", 88.0, 102),
                new Item(4, "D", 40.0, 101),
                new Item(5, "E", 60.0, 102),
                new Item(6, "F", 18.0, 101),
        };

        int[] uniqueStores = extractUniqueStoreIds(items);

        for (int storeId : uniqueStores) {
            System.out.println("Mặt hàng có giá bán cao nhất của mỗi cửa hàng " + storeId + " là:");
            System.out.println(findHighestPriceItem(items, storeId));
        }
    }

    private static int[] extractUniqueStoreIds(Item[] items) {
        int[] storeIds = new int[items.length];
        int count = 0;

        for (Item item : items) {
            if (!contains(storeIds, count, item.getStoreId())) {
                storeIds[count++] = item.getStoreId();
            }
        }
        return Arrays.copyOf(storeIds, count);
    }

    private static boolean contains(int[] arr, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    private static Item findHighestPriceItem(Item[] items, int storeId) {
        Item highestItem = null;

        for (Item item : items) {
            if (item.getStoreId() == storeId) {
                if (highestItem == null || item.getSalesPrice() > highestItem.getSalesPrice()) {
                    highestItem = item;
                }
            }
        }
        return highestItem;
    }
}
