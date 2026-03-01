package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.IoUtils;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		// itemGroupService.save(new ItemGroup("Loại Hàng X1", Boolean.TRUE));
		// itemGroupService.update(new ItemGroup(10, "Loại Hàng X10", Boolean.FALSE));
		// itemGroupService.saveOrUpdate(new ItemGroup(11, "Loại Hàng X11", Boolean.TRUE));
		
//		itemGroupService.saveGroups(List.of(
//			new ItemGroup("Loại Hàng 14", true),
//			new ItemGroup("Loại Hàng 15", false),
//			new ItemGroup("Loại Hàng 16", true)
//		));
		
		IoUtils.generate(
			"1. Liệt kê các loại hàng trong hệ thống", 
			itemGroupService.getAll()
		);
		
		IoUtils.generate(
			"2. Liệt kê loại hàng theo mã loại", 
			itemGroupService.get(22)
		);
		
		
		// 3. Liệt kê loại hàng theo tên loại
		// - Statement: Tìm hiểu lỗi sql injection
		// - PreparedStatement: Xử lý lỗi
		IoUtils.generate(
				"3. Liệt kê loại hàng theo tên loại", 
				itemGroupService.get("Túi Xách")
		);
		// 4. Liệt kê các mặt hàng(kèm thông tin loại hàng)
		// Yêu cầu: Lấy tất cả các cột
		
		System.out.println("4. Liệt kê loại hàng kèm thông tin mặt hàng");
		final var groups = itemGroupService.getItemGroup();
		groups.forEach(group -> {
			System.out.print(group);
			for (var item: group.getItems()) {
				System.out.println("   - "+item);
			}
		});
		
		// 5. Liệt kê các loại hàng(kèm danh sách mặt hàng của mỗi loại)
		// Yêu cầu: Lấy tất cả các cột
		
		// 6. Liệt kê, đếm số lượng mặt hàng của từng loại hàng
		// Thông tin cần lấy: MaLH, TenLH, TongSoLuongMatHang, ChiTiet(TenMatHang, KichCo, SoLuong)
		IoUtils.generate(
				"6. Liệt kê, đếm số lượng mặt hàng của từng loại hàng", 
				itemGroupService.getItemGroupDetails()
		);
		
		// 7. Liệt kê mặt hàng có số lượng nhiều nhất trong hệ thống
		// Yêu cầu: TenMH, SoLuong --> if(rs.next)
		
		
		// 8. Truy vấn dữ liệu liên quan Date, Time
		
		// 9. Thêm mới khách hàng vào hệ thống(MD5)
		
		// 10. Bài toán @Transactional
	}
	
}
