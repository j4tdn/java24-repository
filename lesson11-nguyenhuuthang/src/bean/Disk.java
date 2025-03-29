package bean;

import java.util.Objects;

public class Disk {
	private int id;
	private String type;
	private String singer;
	private int numberSong;
	private Double price;

	public Disk() {
	}

	public Disk(int id, String type, String singer, int numberSong, Double price) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.numberSong = numberSong;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberSong() {
		return numberSong;
	}

	public void setNumberSong(int numberSong) {
		this.numberSong = numberSong;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Disk other = (Disk) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Disk [id=" + id + ", type=" + type + ", singer=" + singer + ", numberSong=" + numberSong + ", price="
				+ price + "]";
	}

}
