package bean;

import java.util.Objects;

public class CdDisk {
	
	private int id;
	private String type;
	private String singer;
	private int number;
	private double value;
	
	public CdDisk() {
	}

	public CdDisk(int id, String type, String singer, int number, double value) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.number = number;
		this.value = value;
	}


	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getSinger() {
		return singer;
	}

	public int getNumber() {
		return number;
	}

	public double getValue() {
		return value;
	}

	public void setId(int id) {
		if(id<1) {
			throw new IllegalArgumentException("Phải là số nguyên dương");
		}
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setValue(double value) {
		if(value<1) {
			throw new IllegalArgumentException("Phải là số nguyên dương");
		}
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof CdDisk that)) {
			return false;
		}
		
		return this.getId() == that.getId();
		
	}

	@Override
	public String toString() {
		return "CdDisk [id=" + id + ", type=" + type + ", singer=" + singer + ", number=" + number + ", value=" + value
				+ "]";
	}
	

}
