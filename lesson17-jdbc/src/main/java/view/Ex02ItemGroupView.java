package view;

import java.util.List;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.IoUtils;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {

		IoUtils.generate(
			"1. Liệt kê các loại hàng trong hệ thống", 
			itemGroupService.getAll()
		);
		
		IoUtils.generate(
			"2. Liệt kê loại hàng theo mã loại", 
			itemGroupService.get(3)
		);
		
		// 3. Liệt kê loại hàng theo tên loại
		// - Statement: Tìm hiểu lỗi sql injection
		// - PreparedStatement: Xử lý lỗi
		IoUtils.generate("3. Liệt kê loại hàng theo tên loại", itemGroupService.get("Giày"));
		// 4. Liệt kê các mặt hàng(kèm thông tin loại hàng)
		// Yêu cầu: Lấy tất cả các cột
		
		// 5. Liệt kê các loại hàng(kèm danh sách mặt hàng của mỗi loại)
		// Yêu cầu: Lấy tất cả các cột
		
		// 6. Liệt kê, đếm số lượng mặt hàng của từng loại hàng
		// Thông tin cần lấy: MaLH, TenLH, TongSoLuongMatHang, ChiTiet(TenMatHang, KichCo, SoLuong)
		
		// 7. Liệt kê mặt hàng có số lượng nhiều nhất trong hệ thống
		// Yêu cầu: TenMH, SoLuong
		
		// 8. Truy vấn dữ liệu liên quan Date, Time
		
		// 9. Thêm mới khách hàng vào hệ thống(MD5)
		
		// 10. Bài toán @Transactional
	}
}