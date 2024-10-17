package shopping;

import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {

		/*
		 * c1: 1, Ahuy, 123, NewZealend c2: 2, Man, 232, My
		 * 
		 * i1: IP10, IOS, Black, 1000 i2: IP11, IOS, Yellow, 1900 i3: IP12, IOS, Rose,
		 * 2100 i4: IP13, IOS, White, 2200
		 * 
		 * o1: c1, {id1(i1, 3), id2(i2, 1), id3(i3, 1)}
		 */

		final Customer c1 = new Customer("KH1", "Huy", "123", "NewZeland");
		final Customer c2 = new Customer("KH1", "Huy", "123", "NewZeland");

		final Item i1 = new Item("IP10", "Android", "Black", 300d);
		final Item i2 = new Item("IP11", "IOS", "Rose", 500d);
		final Item i3 = new Item("IP12", "IOS", "White", 1100d);
		final Item i4 = new Item("IP13", "WindowPhone", "Rose", 1500d);

		Order o1 = new Order(c1,
				new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i2, 2), new ItemDetail(i4, 5) },
				LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		Order o2 = new Order(c2,
				new ItemDetail[] { new ItemDetail(i1, 1), new ItemDetail(i2, 1), new ItemDetail(i4, 3) },
				LocalDateTime.of(2021, 5, 9, 11, 11, 11));
		System.out.println("Order1: " + OrderUtils.export(o1));
		System.out.println("Order2: " + OrderUtils.export(o2));

	}
}
