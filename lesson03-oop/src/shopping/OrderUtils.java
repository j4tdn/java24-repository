package shopping;

import java.time.LocalDate;
import java.time.Month;

/*
 * Utility of Order class
 * Normally: Utility is place where contains utility methods
 * No care created class's object
 */

public class OrderUtils {

	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for(ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if(item.getCost() > 1500 && LocalDate.of(2024, Month.OCTOBER, 18).isEqual(order.getDateTime().toLocalDate())) {
				idCost *= 0.8;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
		
	}
}
