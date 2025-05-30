package bean;

import java.util.Objects;

import common.Kind;

public class Dish {
	
	private String id;
	private String name;
	private Double calories;
	private Kind kind; // loại thức ăn
	
	public Dish() {
	}

	public Dish(String id, String name, Double calories, Kind kind) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.kind = kind;
	}
	
	public static boolean isVeggie(Dish d) {
		return d.getKind() == Kind.VEGGIE;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Dish that)) {
			return false;
		}
		
		return getId().equals(that.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", kind=" + kind + "]";
	}
	
}
