package bean;

import java.util.Objects;

public class StoreCD {
	Integer cdId;
	String cdType;
	String singer;
	Integer songCount;
	Double price;

	public StoreCD() {
	}

	public StoreCD(Integer cdId, String cdType, String singer, Integer songCount, Double price) {
		this.cdId = cdId;
		this.cdType = cdType;
		this.singer = singer;
		this.songCount = songCount;
		this.price = price;
	}

	public Integer getCdId() {
		return cdId;
	}

	public void setCdId(Integer cdId) {
		this.cdId = cdId;
	}

	public String getCdType() {
		return cdType;
	}

	public void setCdType(String cdType) {
		this.cdType = cdType;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Integer getSongCount() {
		return songCount;
	}

	public void setSongCount(Integer songCount) {
		this.songCount = songCount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof StoreCD that)) {
			return false;
		}
		
		return getCdId() == that.getCdId();
	}
	
	public int hashCode() {
		return Objects.hash(getCdId());
	}

	@Override
	public String toString() {
		return "StoreCD [cdId=" + cdId + ", cdType=" + cdType + ", singer=" + singer + ", songCount=" + songCount
				+ ", price=" + price + "]";
	}
}
