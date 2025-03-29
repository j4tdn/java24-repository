package bean;

import java.util.Objects;

public class CDDisk {

	private Integer id;
	private String typeCD;
	private String singer;
	private Integer numOfSong;
	private Double price;
	
	public CDDisk() {
	}

	public CDDisk(Integer id, String typeCD, String singer, Integer numOfSong, Double price) {
		super();
		this.id = id;
		this.typeCD = typeCD;
		this.singer = singer;
		this.numOfSong = numOfSong;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeCD() {
		return typeCD;
	}

	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Integer getNumOfSong() {
		return numOfSong;
	}

	public void setNumOfSong(Integer numOfSong) {
		this.numOfSong = numOfSong;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CDDisk that) ) {
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
		return "CDDisk [id=" + id + ", typeCD=" + typeCD + ", singer=" + singer + ", numOfSong=" + numOfSong
				+ ", price=" + price + "]";
	}
	


}

