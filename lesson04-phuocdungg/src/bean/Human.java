package bean;

import java.time.LocalDate;

public abstract class Human {

	private String name;
	private LocalDate birthDay;
	private Double levelSalary;
	

	public Human() {

	}

	public Human(String name, LocalDate birthDay, Double levelSalary) {

		this.name = name;
		this.birthDay = birthDay;
		this.levelSalary = levelSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public Double getLevelSalary() {
		return levelSalary;
	}

	public void setLevelSalary(Double levelSalary) {
		this.levelSalary = levelSalary;
	}


	public abstract void salary();
	public abstract void printInfo();

	@Override
	public String toString() {
		return "Human [name=" + name + ", birthDay=" + birthDay + ", levelSalary=" + levelSalary + "]";
	}

}
