package view;

import bean.Item;

import java.util.*;

public class Ex06VarKeyword {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 20;
        String s = "Hello";
        Item item = new Item();
        List<String> elements = new ArrayList<>();
        Set<Map.Entry<String, Integer>> set = new HashSet<>();

        var item1 = new Item();
        var elements1 = new ArrayList<String>();
    }
}
