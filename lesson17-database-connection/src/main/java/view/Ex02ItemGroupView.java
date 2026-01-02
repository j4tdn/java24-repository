package view;

import bean.Item;
import bean.ItemGroup;
import bean.ItemGroupAndItem;
import bean.ListGroups;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

import java.util.List;

public class Ex02ItemGroupView {
    private static ItemGroupService itemGroupService;

    static {
            itemGroupService = new ItemGroupServiceImpl();
    }


    public static void main(String[] args) {

        // liet ke loai hang theo ten loai
        // - statement: sql injection
        // - PreparedStatement: xu li loi
//        ItemGroup getItemByName = itemGroupService.getItemByName("Áo");
//        System.out.println(getItemByName);

        // Liet ke cac mat hang(kem thong tin loai hang)

//        List<ItemGroupAndItem> getAllItemGroups = itemGroupService.getAllItemGroups();
//        for (ItemGroupAndItem itemGroup : getAllItemGroups) {
//            System.out.println(itemGroup);
//        }

        // Liet ke cac loai hang kem danh sach mat hang cua moi loai
        // select *

        // Liet ke, dem so luong mat hang cua tung loai hang
        // Thong tin can lay: MaLH, TenLH, TongSoLuongMatHang, ChiTiet(TenMatHang, Kichco, Soluong)
        List<ListGroups> getAllListGroups = itemGroupService.getAllListGroups();
        for (ListGroups listGroups : getAllListGroups) {
            System.out.println(listGroups);
        }


        // Liet ke cac mat hang co so luong nhieu nhat trong he thong
        // TenMH, Soluong
        List<Item>  getAllItems = itemGroupService.getAllItems();
        for (Item item : getAllItems) {
            System.out.println(item);
        }
    }


}
