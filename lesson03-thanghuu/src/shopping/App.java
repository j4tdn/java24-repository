package shopping;

import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {
		
		/*
			c1: KH01, Adam, 123, NewYork
			c2: KH02, Thangne, 704, GiaLai

			i1: SS10+, Android, Black, 620
			i2: SS20U, Android, Green, 840
			i3: IP4, IOS, White, 280
			i4: IP12, IOS, Black, 880
			i5: WP8, WindowPhone, Blue, 560
			
			Order: c1, {id1(i1, 3), id2(i4, 1), id3(i2, 1)}, date_time 
			Order: c2, {id1(i1, 2), id2(i5, 1)}, date_time 
			Order: c2, {id1(i4, 1)}, date_time 
		
		*/
		
		Customer c1 = new Customer("KH01", "Adam", "123","NewYork");
		Customer c2 = new Customer("KH02", "Thangne", "704", "GiaLai");
		
		Item i1 = new Item("SS10", "Android" ,"Black", 620);
		Item i2 = new Item("SS20U", "Android" ,"Green", 840);
		Item i3 = new Item("IP4", "IOS" ,"White", 280);
		Item i4 = new Item("IP12", "IOS" ,"Black", 880);
		Item i5 = new Item("WP8", "WindowPhone" ,"Blue", 560);
		
//		ItemDetail id1 = new ItemDetail(i1, 3);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1, 3),
				new ItemDetail(i4, 5),
				new ItemDetail(i2, 1)
		}, LocalDateTime.of(2024, 5, 8, 10, 10, 10));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3, 2),
				new ItemDetail(i5, 1)
		}, LocalDateTime.of(2024, 5, 7, 20, 10, 12));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4, 1),
		}, LocalDateTime.of(2024, 5, 8, 9, 28, 32));
		
		System.out.println("Order 1: " + o1.export());
		System.out.println("Order 2: " + o2.export());
		System.out.println("Order 3: " + o3.export());
	}
	
}
