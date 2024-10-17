package ex02;

import java.time.LocalDate;
import java.time.Month;

import shopping.Item;
import shopping.ItemDetail;

public class Vehicle {
	private String id;
	private String owner;
	private String type;
	private double capacity;
	private double price;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String id, String owner, String type, double capacity, double price) {
		super();
		this.id = id;
		this.owner = owner;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", owner=" + owner + ", type=" + type + ", capacity=" + capacity + ", price="
				+ price + "]";
	}

	public double export() {

		double submitTax = 0;
		
		//Em ngoi 3 tieng roi ma khong ra anh oi :((
		
//		ItemDetail[] ids = getItemDetails();
//		for (ItemDetail id : ids) {
//			Item item = id.getItem();
//			int quantity = id.getQuantity();
//
//			double idCost = item.getCost() * quantity;
//
//			if (item.getCost() > 590 && LocalDate.of(2024, Month.MAY, 8).isEqual(getOrderDate().toLocalDate())) {
//				idCost *= 0.9;
//			}
//
//			totalOfMoney += idCost;
//		}

		return submitTax;
	}

}
