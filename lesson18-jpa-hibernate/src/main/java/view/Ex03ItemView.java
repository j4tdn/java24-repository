package view;

import java.util.List;

import persistence.Item;
import persistence.ItemDetail;
import service.ItemService;
import service.ItemServiceImpl;
import utils.IoUtils;

public class Ex03ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		final var items = itemService.getAll();
		IoUtils.generate(
			"4. Liệt kê các mặt hàng trong hệ thống", 
			items
		);
		
		Item item4 = items.get(4);
		
		System.out.println("@ManyToOne[FetchType] Item->ItemGroup: " + item4.getGroup());
		
		List<ItemDetail> itemDetails = item4.getItemDetails();
		
		System.out.println("\n@OneToMany[FetchType] Item->ItemDetail(s)");
		
		itemDetails.forEach(System.out::println);
		
		
	}
	
}
