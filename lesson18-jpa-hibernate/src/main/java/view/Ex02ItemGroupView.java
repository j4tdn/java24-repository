package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		// System.out.println("6. Thêm mới loại hàng");
		// itemGroupService.save(new ItemGroup(null, "Loại Hàng 99", true));
		
		/*
		System.out.println("\n");
		
		IoUtils.generate(
			"1. Liệt kê các loại hàng trong hệ thống", 
			itemGroupService.getAll()
		);
		
		final var ig2 = itemGroupService.get(2);
		
		IoUtils.generate(
			"2. Liệt kê loại hàng theo mã loại", 
			ig2
		);
		
		List<ItemGroupDto> itemGroupDetails = itemGroupService.getItemGroupDetails();
		IoUtils.generate(
			"\n5. Liệt kê chi tiết loại hàng", 
			itemGroupDetails
		);
		
		System.out.println("===== @OneToMany[LazyFetch] ItemGroup -> Items =====");
		IoUtils.generate(
			"2. Liệt kê mặt hàng từ loại hàng ig2", 
			ig2.getItems()
		);
		
		IoUtils.generate(
			"3. Liệt kê loại hàng theo tên loại", 
			itemGroupService.get("TL")
		);
		*/
		
		itemGroupService.testHibernateCache();
	}
	
}
