package Ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetail;
	private LocalDateTime orderdate;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetail, LocalDateTime orderdate) {
		this.customer = customer;
		this.itemDetail = itemDetail;
		this.orderdate = orderdate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail[] itemDetail) {
		this.itemDetail = itemDetail;
	}

	public LocalDateTime getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(LocalDateTime orderdate) {
		this.orderdate = orderdate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetail=" + Arrays.toString(itemDetail) + ", orderdate="
				+ orderdate + "]";
	}

	public double export() {
		double totolOfMoney = 0;
		ItemDetail[] ids = getItemDetail();
		
		// for each
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();

			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderdate().toLocalDate())) {
				idCost *= 0.9;
			} 
				totolOfMoney += idCost;
			
		}

		return totolOfMoney;
	}
	

	
	
}