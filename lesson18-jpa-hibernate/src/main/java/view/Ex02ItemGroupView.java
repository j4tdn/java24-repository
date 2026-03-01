package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {
    private static final ItemGroupService itemGroupService;

    static{
        itemGroupService = new ItemGroupServiceImpl();
    }

    public static void main(String[] args) {
        System.out.println(itemGroupService.getAll());

        System.out.println(itemGroupService.get(1));

        System.out.println(itemGroupService.get("Áo"));
    }
}
