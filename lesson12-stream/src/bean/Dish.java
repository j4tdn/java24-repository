package bean;

import common.*;
import java.util.Objects;

public class Dish {
	
	private String id;
	private String name;
	private Double calories;
	private Kind kind;
	
	public Dish() {
	}

	public Dish(String id, String name, Double calories, Kind kind) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.kind = kind;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getCalories() {
		return calories;
	}

	public Kind getKind() {
		return kind;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
	
	public static boolean isVeggie(Dish d) {
		return d.getKind() == Kind.VEGGIE;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Dish that))
			return false;
		return this.getId().equals(that.getId());
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", kind=" + kind + "]";
	}
	
	

}
