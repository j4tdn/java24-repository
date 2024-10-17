package utils;

import java.time.LocalDate;
import java.time.Month;

import bean.Item;
import bean.ItemDetail;
import bean.Order;

public class OrderUtils {
	private OrderUtils() {
		// TODO Auto-generated constructor stub
	}

	public static double export(Order order) {
		double totalOfMoney = 0;

		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			double idCost = item.getCost() * id.getAmount();
			if (item.getCost() > 590
					&& LocalDate.of(2024, Month.MAY, 8).isEqual(order.getOrderDateTime().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}
}
