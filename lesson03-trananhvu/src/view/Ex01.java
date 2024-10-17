package view;

import java.time.LocalDateTime;

import bean.Customer;
import bean.Item;
import bean.ItemDetail;
import bean.Order;
import utils.OrderUtils;

public class Ex01 {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "New York");
		Customer c2 = new Customer("KH2", "Eva", "234", "Cali");
		Customer c3 = new Customer("KH3", "Tran Anh Vu", "0909090909", "Viet Nam");

		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U", "Android", "Green", 1000);
		Item i3 = new Item("Ip16PRM", "Ios", "Yellow", 1200);
		Item i4 = new Item("Ip15", "Ios", "Blue", 1500);

		Order o1 = new Order(c1, new ItemDetail[] { new ItemDetail(i1, 3), new ItemDetail(i3, 2) },
				LocalDateTime.of(2024, 10, 15, 11, 17, 20));
		Order o2 = new Order(c2, new ItemDetail[] { new ItemDetail(i2, 3), new ItemDetail(i4, 5) },
				LocalDateTime.of(2024, 10, 15, 11, 17, 28));
		Order o3 = new Order(c3, new ItemDetail[] { new ItemDetail(i2, 3), new ItemDetail(i3, 2) },
				LocalDateTime.of(2024, 10, 15, 11, 17, 35));

		System.out.println("Order 1: " + OrderUtils.export(o1));
		System.out.println("Order 1: " + OrderUtils.export(o2));
		System.out.println("Order 1: " + OrderUtils.export(o3));
	}
}
