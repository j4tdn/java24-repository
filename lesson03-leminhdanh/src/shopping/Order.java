package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetais;
	private LocalDateTime orderDate;

	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetais, LocalDateTime orderDate) {
		this.customer = customer;
		this.itemDetais = itemDetais;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetais() {
		return itemDetais;
	}

	public void setItemDetais(ItemDetail[] itemDetais) {
		this.itemDetais = itemDetais;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	
	
	public double export() {
		System.out.println(customer.toString());
		
		System.out.println("\tid\t\tcolor\t\tos\t\tcost");
		System.out.println("===================================================================");
		
		double totoOfMoney = 0;
		ItemDetail[] ids = getItemDetais();
		for(ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getAmount();
			
			System.out.printf("\t%s\t\t%s\t\t%s\t\t%s\n" , item.getId(), item.getColor(), item.getOs(), item.getCost());
			
			
			double idCost = item.getCost()*quantity;
			if (LocalDate.of(2021, 5, 8).isEqual(getOrderDate().toLocalDate())&&item.getCost()>590) {
				idCost*=0.9;
			}
			totoOfMoney+= idCost;
		}
		return totoOfMoney;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetais=" + Arrays.toString(itemDetais) + ", orderDate="
				+ orderDate + "]";
	}

}
