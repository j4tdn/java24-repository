package builder;

import java.time.LocalDate;

public class Ex01BuilderDemo {

	public static void main(String[] args) {

		Item i1 = Item.builder().withId(1).withName("A").withSalesPrice(12d).build();
		System.out.println("i1: " + i1);

		Item i2 = Item.builder().withId(2).withName("B").withSalesPrice(34d).build();
		System.out.println("i2 name: " + i2.getName());

		System.out.println("\n==========\n");

		AdvItem advItem1 = AdvItem.of().withId(555).withName("Adv Item 555")
				.withExpiredDate(LocalDate.now().plusDays(14)).withSalesPrice(22d);
		System.out.println("advItem: " + advItem1);
		System.out.println("advItem hash 1 " + System.identityHashCode(advItem1));
		System.out.println("advItem hash 2 " + System.identityHashCode(advItem1.withId(26)));

		System.out.println("\n===================\n");

		LocalDate date = LocalDate.now() // LocalDate
				.withDayOfMonth(2).plusDays(2).withMonth(4);
		System.out.println("date: " + date);
		System.out.println("date hash 1 " + System.identityHashCode(date));
		System.out.println("date hash 2 " + System.identityHashCode(date.withYear(2026)));

		System.out.println("\n===================================\n");

		PvItem pvItem1 = PvItem.of().withId(5125).withName("PvItem 555").withExpiredDate(LocalDate.now().plusDays(14))
				.withSalesPrice(22d);
		System.out.println("pvItem: " + pvItem1);
		System.out.println("pvItem hash 1 " + System.identityHashCode(pvItem1));
		System.out.println("pVItem hash 2 " + System.identityHashCode(pvItem1.withId(202)));
	}

}
