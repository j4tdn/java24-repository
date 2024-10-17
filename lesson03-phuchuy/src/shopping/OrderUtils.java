package shopping;

import java.time.LocalDate;

public class OrderUtils {
	public static double export(Order order) {
		double total = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			if (item.getCost() > 590 && LocalDate.of(2021, 5, 8).isEqual(order.getOrderTime().toLocalDate())) {
				total += item.getCost() * quantity * 0.9;
			} else {
				total += item.getCost() * quantity;
			}

		}

		return total;
	}

}
