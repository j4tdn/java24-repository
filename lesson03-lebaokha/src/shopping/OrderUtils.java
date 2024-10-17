package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * Utility of Order Class Normally: Utility is place where contains utility
 * method No cares created class's objects
 */

public class OrderUtils {

	private OrderUtils() {

	}

	// o1 o2 o3
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();

		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();

			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590
					&& LocalDate.of(2024, Month.OCTOBER, 17).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;

		}

		return totalOfMoney;

	}
}
