package exercise04;

import java.time.LocalDate;

public abstract class Person {
	private String name;
	private LocalDate dayOfBirth;
	private double salaryCoefficient;
	
	public Person() {
	}


	public Person(String name, LocalDate dayOfBirth, double salaryCoefficient) {
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.salaryCoefficient = salaryCoefficient;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}


	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}


	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}


	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", dayOfBirth=" + dayOfBirth + ", salaryCoefficient=" + salaryCoefficient + "]";
	}

	
	
}
