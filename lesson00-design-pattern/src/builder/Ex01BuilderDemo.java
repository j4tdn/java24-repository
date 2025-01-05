package builder;

import java.time.LocalDate;

import javax.sql.rowset.serial.SQLOutputImpl;

import builder.Item.Builder;

public class Ex01BuilderDemo {

	public static void main(String[] args) {
		
		Item i1 = Item.builder().withId(1).withName("A").withSalesPrice(12d).build();
		System.out.println("i1 --> " + i1);

		// Cách 2
		LocalDate date = LocalDate.now().withDayOfMonth(2).plusDays(2).withMonth(4);

		AdvItem advItem1 = AdvItem.of().withId(555).withName("AdvItem 555")
				.withExpiredDate(LocalDate.now().plusDays(14)).withSalesPrice(22d);

		System.out.println("advItem1: " + advItem1);
		System.out.println("advItem1 hash01: " +  System.identityHashCode(advItem1));
		System.out.println("advItem1 hash02: " + System.identityHashCode(advItem1.withId(234)));
		
		
		System.out.println("\n===========================\n");
		PvItem pvItem1 = PvItem.of().withId(555).withName("AdvItem 555")
				.withExpiredDate(LocalDate.now().plusDays(14)).withSalesPrice(22d);

		System.out.println("advItem: " + pvItem1);
		System.out.println("advItem1 hash01: " +  System.identityHashCode(advItem1));
		System.out.println("advItem1 hash02: " + System.identityHashCode(advItem1.withId(555)));
	}

}
