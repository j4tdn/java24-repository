package shopping;

import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) {

		Customer c1 = new Customer("KH1", "Adam", "234114", "NewYork");
		Customer c2 = new Customer("KH2", "Enma", "4214", "Texas");
		
		Item i1 = new Item("IP12", "IOS", "Black", 3000);
		Item i2 = new Item("IP13", "IOS", "White", 4000);
		Item i3 = new Item("IP14", "IOS", "Green", 5000);
		Item i4 = new Item("IP15", "IOS", "Gray", 6000);
		
		Order o1 = new Order(c1, new ItemDetail[] {new ItemDetail(i1,3)}, LocalDateTime.of(2024, 10, 18, 20, 34, 23));
	}
}
