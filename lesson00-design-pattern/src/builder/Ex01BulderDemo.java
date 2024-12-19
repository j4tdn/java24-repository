package builder;

import java.time.LocalDate;

import builder.Item.Builder;

public class Ex01BulderDemo {

	public static void main(String[] args) {
		Item i1 = Item.builder()
				.withId(1)
				.withName("A")
				.withSalesPrice(12d)
				.build();

//		Cần tạo ra Item
		System.out.println("i1: " + i1);

		Item i2 = Item.builder()
				.withId(1)
				.withName("A")
				.withSalesPrice(12d)
				.build();

		System.out.println("i2: " + i2);

		
		System.out.println("\n=================\n");
		
//		Gọi hàm setter/with xong trả về đối tượng tại
		LocalDate date = LocalDate.now()
				.withDayOfMonth(2)
				.plusDays(2)
				.withMonth(4);
		System.out.println("date: " + date);

		
		System.out.println("\n=================\n");
		
		AdvItem advItem1 = AdvItem.of() // AdvItem
				.withId(555)
				.withName("AdvItem 555")
				.withExpireDate(LocalDate.now().plusDays(14))
				.withSalesPrice(22d);
		System.out.println("AdvItem1: " + advItem1);
		System.out.println("advItem1 hash 01:  " + System.identityHashCode(advItem1));
		System.out.println("advItem1 hash 02:  " + System.identityHashCode(advItem1.withId(3)));
		
		
		
		System.out.println("\n=================\n");
		
		PvItem pvItem = PvItem.of()
				.withId(555)
				.withName("AdvItem 555")
				.withExpireDate(LocalDate.now().plusDays(14))
				.withSalesPrice(22d);
		System.out.println("pvItem: " + pvItem);
		System.out.println("pvItem hash 01:  " + System.identityHashCode(pvItem));
		System.out.println("pvItem hash 02:  " + System.identityHashCode(pvItem.withId(3)));

	}

}
