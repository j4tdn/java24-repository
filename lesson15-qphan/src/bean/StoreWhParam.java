package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class StoreWhParam {
	
	private Integer storeId;
	private Integer whId;
	private BigDecimal storeDemand;
	
	public StoreWhParam(Integer storeId, Integer whId, BigDecimal storeDemand) {
		this.storeId = storeId;
		this.whId = whId;
		this.storeDemand = storeDemand;
	}
	
	public BigDecimal getStoreDemand() {
		return storeDemand;
	}
	
	public Integer getStoreId() {
		return storeId;
	}
	
	public Integer getWhId() {
		return whId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof StoreWhParam that)) {
			return false;
		}
		
		return Objects.equals(getStoreId(), that.getStoreId())
			&& Objects.equals(getWhId(), that.getWhId());	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getStoreId(), getWhId());
	}

	@Override
	public String toString() {
		return "StoreWhParam [storeId=" + storeId + ", whId=" + whId + ", storeDemand=" + storeDemand + "]";
	}
}
