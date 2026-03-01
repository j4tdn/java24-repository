package persistence;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "T12_ORDER_DETAIL")
public class OrderDetail {

	@EmbeddedId
	private Id id;

	@ManyToOne
	@JoinColumn(name = "C12_ORDER_ID", referencedColumnName = "C09_ORDER_ID")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "C12_ITEM_DETAIL_ID", referencedColumnName = "C03_ITEM_DETAIL_ID")
	private ItemDetail itemDetail;

	@Column(name = "C12_AMOUNT")
	private BigDecimal amount;

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ItemDetail getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof OrderDetail that)) {
			return false;
		}

		return Objects.equals(getId(), that.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", order=" + order + ", itemDetail=" + itemDetail + ", amount=" + amount + "]";
	}

	@Embeddable
	public static class Id {

		@Column(name = "C12_ORDER_ID", insertable = false, updatable = false)
		private Integer orderId;

		@Column(name = "C12_ITEM_DETAIL_ID", insertable = false, updatable = false)
		private Integer itemDetailId;

		public Id() {
		}

		public Id(Integer orderId, Integer itemDetailId) {
			this.orderId = orderId;
			this.itemDetailId = itemDetailId;
		}

		public Integer getOrderId() {
			return orderId;
		}

		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}

		public Integer getItemDetailId() {
			return itemDetailId;
		}

		public void setItemDetailId(Integer itemDetailId) {
			this.itemDetailId = itemDetailId;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (!(o instanceof Id that)) {
				return false;
			}

			return Objects.equals(getOrderId(), that.getOrderId())
					&& Objects.equals(getItemDetailId(), that.getItemDetailId());
		}

		@Override
		public int hashCode() {
			return Objects.hash(getOrderId(), getItemDetailId());
		}

		@Override
		public String toString() {
			return "Id [orderId=" + orderId + ", itemDetailId=" + itemDetailId + "]";
		}
	}

}
