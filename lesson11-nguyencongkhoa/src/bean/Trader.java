package bean;

import java.util.Objects;

public class Trader {
	private String name;
	private String city;

	public Trader() {
	}

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// equals, hashcode
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} 
		if (!(o instanceof Trader that)){
			return false;
		}
		return name == that.name && city == that.city;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName(), getCity());
	}
	
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}

}