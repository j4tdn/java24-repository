package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1","Phước","0347941497","QuangNgai");
		Customer c2 = new Customer("KH2","PhướcDZ","1234567890","DaNang");
		
		Item i1 = new Item("SS10+","Android","Black",620);
		Item i2 = new Item("SS20U","Android","Green",840);
		Item i3 = new Item("IP4","IOS","White",280);
		Item i4 = new Item("IP12","IOS","Black",880);
		Item i5 = new Item("WP8","Windowphone","Blue",560);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,3),//1860
				new ItemDetail(i4,5),//4400
				new ItemDetail(i2,1),//560
				
		}, LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3,2),
				new ItemDetail(i5,1),
				
		}, LocalDateTime.of(2021, 5, 7, 20, 10, 12));
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4, 1),
				
		}, LocalDateTime.of(2021, 5, 18, 9, 28, 32));
		
		System.out.println("Total Payment :" + o1.export());
		System.out.println("Total Payment :" + o2.export());
		System.out.println("Total Payment :" + o3.export());
		
		// write method export in Order class: no-paramter
		// write method export in Another class: export(order)
		
		
	}

}
