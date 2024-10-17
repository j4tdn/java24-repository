package shopping;

import java.time.LocalDate;
import java.time.Month;

/*
 	Utility class of Order class
 	Normally: Utility is place where contains utility methods
 	No care created class's objects
 */
public class OrderUtils {
	private OrderUtils() {
	}
	
	public static double export(Order order) {
		double totolOfMoney = 0;
		ItemDetail[] ids = order.getItemDetail();
		
		// for each
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();

			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderdate().toLocalDate())) {
				idCost *= 0.9;
			} 
				totolOfMoney += idCost;
			
		}

		return totolOfMoney;
	}
	

}