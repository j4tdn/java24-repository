package bean;

public class RefItemStoreId {
	private Integer refItemId;
	private Integer storeId;
	
	public RefItemStoreId(Integer refItemId, Integer storeId) {
		this.refItemId = refItemId;
		this.storeId = storeId;
	}
	
	public Integer getRefItemId() {
		return refItemId;
	}
	
	public Integer getStoreId() {
		return storeId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof RefItemStoreId that)) {
			return false;
		}

		return getRefItemId().equals(that.getRefItemId())
			&& getStoreId().equals(that.getStoreId());
	}
}
