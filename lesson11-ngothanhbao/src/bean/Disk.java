package bean;

import java.util.Objects;

public class Disk {
	private int idDisk;
	private String typeDisk;
	private String artist;
	private int amount;
	private Double salesPrice;
	
	public Disk() {
	}

	public Disk(int idDisk, String typeDisk, String artist, int amount, Double salesPrice) {
		super();
		this.idDisk = idDisk;
		this.typeDisk = typeDisk;
		this.artist = artist;
		this.amount = amount;
		this.salesPrice = salesPrice;
	}

	public int getIdDisk() {
		return idDisk;
	}

	public void setIdDisk(int idDisk) {
		this.idDisk = idDisk;
	}

	public String getTypeDisk() {
		return typeDisk;
	}

	public void setTypeDisk(String typeDisk) {
		this.typeDisk = typeDisk;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Disk that)) {
			return false;
		}
		
		return idDisk == that.idDisk;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(idDisk);
	}
	
	
	@Override
	public String toString() {
		return "Disk [idDisk=" + idDisk + ", typeDisk=" + typeDisk + ", artist=" + artist + ", amount=" + amount
				+ ", salesPrice=" + salesPrice + "]";
	}
	
	
}
