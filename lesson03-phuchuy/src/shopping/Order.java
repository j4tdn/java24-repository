package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderTime;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderTime="
				+ orderTime + "]";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetail[] itemDetails) {
		this.itemDetails = itemDetails;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderTime) {
		super();
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderTime = orderTime;
	}

}
