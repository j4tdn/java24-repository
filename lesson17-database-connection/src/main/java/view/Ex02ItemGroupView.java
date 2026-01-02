package view;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemServiceImp;
import utils.IoUtils;

import java.util.List;

public class Ex02ItemGroupView {
    private static ItemGroupService itemGroupService;
    private static ItemServiceImp itemSevice;
    static {
        itemGroupService = new ItemGroupServiceImpl();
        itemSevice = new ItemServiceImp();
    }

    public static void main(String[] args) {
        itemGroupService.saveGroups(List.of(
                new ItemGroup("Loại hàng 12", Boolean.TRUE),
                new ItemGroup("Loại hàng 13", Boolean.FALSE),
                new ItemGroup("Loại hàng 14", Boolean.TRUE)
        ));

        IoUtils.generate("1. Liệt kê item group ", itemGroupService.getAll());
        IoUtils.generate("2. Liệt kê item group theo id ", itemGroupService.get(1));
        //itemGroupService.save(new ItemGroup(10, "Loại hàng X10", Boolean.TRUE));
        //itemGroupService.update(new ItemGroup(11, "Loại hàng X101", Boolean.TRUE));
        //itemGroupService.saveOrUpdate(new ItemGroup(11, "Loại hàng X11", Boolean.TRUE));


        //3. Liệt kê loại hàng theo tên loại
        // - Statement: Tìm hiểu lỗi sql injection
        // - Prepared Statement: xử lí lỗi

        IoUtils.generate("3. Liệt kê loại hàng theo tên loại ", itemGroupService.getByName("Loại hàng 12"));


        /*
        4. liệt kê các mặt hàng kèm thông tin loại hàng
        Yêu cầu: lấy tất cả cột
         */
        IoUtils.generate("4. liệt kê các mặt hàng kèm thông tin loại hàng ", itemSevice.getAll());

        /*
        5. Liệt kê các loại hàng
        Yêu cầu: lấy tất cả cột
         */

        /*
        6. Liệt kê, đếm sl mặt hàng của từng loại hàng
        Thông tin cần lây: MaLH, TenLH, TongSoLuongMatHang, ChiTietMatHang, KichCo, SoLuong
         */

        /*
        7. Liệt kê Mathang có SL nhiều nhất trong hệ thống
        Yêu cầu: Tên mặt hàng và sl
         */
    }
}
