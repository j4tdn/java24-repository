package builder;

import java.time.LocalDate;

public class Ex01BuilderDemo {

	public static void main(String[] args) {

		// Tượng tự tạo đối tượng, setter bất kỳ thuộc tính nào vào
		// Code theo style builder
		Item i1 = Item.builder() // Builder
				.withId(1).withName("A").withSalesPrice(12d) // Builder
				.build(); // Item
		System.out.println("i1: " + i1);
		
		Item i2 = Item.builder()
				.withId(2).withName("B").withSalesPrice(34d)
				.build();
		System.out.println("i2: " + i2);
		
		System.out.println("i2 name: " + i2.getName());
		
		System.out.println("\n==========\n");
		
		// Gọi hàm setter/with xong trả về đối tượng tại ok
		LocalDate date = LocalDate.now() // LocalDate
							.withDayOfMonth(2) // LocalDate
							.plusDays(2)
							.withMonth(4);
		System.out.println("date: " + date);
		System.out.println("date hash 01: " + System.identityHashCode(date));
		System.out.println("date hash 02: " + System.identityHashCode(date.withYear(2026)));
		
		System.out.println("\n==========\n");
		
		AdvItem advItem1 = AdvItem.of() // AdvItem
							.withId(555)
							.withName("AdvItem 555")
							.withExpiredDate(LocalDate.now().plusDays(14))
							.withSalesPrice(22d);
		System.out.println("advItem1: " + advItem1);
		System.out.println("advItem1 hash 01: " + System.identityHashCode(advItem1));
		System.out.println("advItem1 hash 02: " + System.identityHashCode(advItem1.withId(234)));
		
		System.out.println("\n==========\n");
		
		PvItem pvItem = PvItem.of() // PvItem
				.withId(555)
				.withName("PvItem 567")
				.withExpiredDate(LocalDate.now().plusDays(14))
				.withSalesPrice(22d);
		System.out.println("pvItem: " + pvItem);
		System.out.println("pvItem hash 01: " + System.identityHashCode(pvItem));
		System.out.println("pvItem hash 02: " + System.identityHashCode(pvItem.withId(555)));
		
	}

}