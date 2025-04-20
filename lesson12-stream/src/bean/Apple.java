package bean;

import java.util.Objects;

public class Apple {
	private int id;
	private String color;
	private double weight;
	private String country;
	
	public Apple() {
	}
	
	public Apple(int id, String color, double weight, String country) {
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.country = country;
	}
	
	public Apple(String line) {
		String[] tokens = line.split(", ");
		if (tokens.length == 4) {
			this.id = Integer.parseInt(tokens[0]);
			this.color = tokens[1];
			this.weight = Double.parseDouble(tokens[2]);
			this.country = tokens[3];
		}
	}
	
	public static int retrieveId(Apple apple) {
		return apple.getId();
	}
	
	public static boolean test(Apple apple) {
		final var fromVn = "Vietnam".equalsIgnoreCase(apple.getCountry());
		
		boolean isPrime = true;
		
		for (int i = 2; i < Math.sqrt(apple.getId()); i++) {
			if (apple.getId() % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		return apple.getId() > 1 && fromVn && isPrime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", country=" + country + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return id == other.id;
	}

	
	
	
}
