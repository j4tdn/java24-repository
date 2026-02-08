package view;

import service.ItemService;
import service.ItemServiceImpl;
import utils.IoUtils;

public class Ex03ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		IoUtils.generate(
			"1. Liệt kê các loại hàng trong hệ thống", 
			itemService.getAll()
		);
	}
	
}
