package persistence;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T09_ORDER")
public class Order {
	
	@Id
	@Column(name = "C09_ORDER_ID")
	private Integer id;
	
	@Column(name = "C09_ORDER_TIME")
	private LocalDateTime orderTime;
	
	public Order() {
	}

	public Order(Integer id, LocalDateTime orderTime) {
		this.id = id;
		this.orderTime = orderTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Order that)) {
			return false;
		}
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderTime=" + orderTime + "]";
	}
}
