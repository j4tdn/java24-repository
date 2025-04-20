package bean;

import java.util.Objects;

public class Apple {

	private int id;
	private String color;
	private double weight;
	private String country;

	public Apple() {
		System.out.println("Hello, empty constructor");
		this.color = "dummy";
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
	
	public static boolean test(Apple apple) {
		final var fromVn = "Vietnam".equalsIgnoreCase(apple.getCountry());
		
		boolean isPrime = true;
		
		final var id = apple.getId();
		
		for (int i = 2; i <= Math.sqrt(id); i++) {
			if (id % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		
		return id > 1 && fromVn && isPrime;
	}
	
	public static int retrieveId(Apple apple) {
		return apple.getId();
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
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Apple that)) {
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
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", country=" + country + "]";
	}
}