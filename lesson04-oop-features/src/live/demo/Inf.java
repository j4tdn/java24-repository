package live.demo;

import java.time.LocalDate;

public class Inf {
	private String name;
	private LocalDate bith;
	private double salary;

	public Inf() {
	}

	public Inf(String name, LocalDate bith, double salary) {
		this.name = name;
		this.bith = bith;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBith() {
		return bith;
	}

	public void setBith(LocalDate bith) {
		this.bith = bith;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Inf [name=" + name + ", bith=" + bith + ", Salary=" + salary + "]";
	}

}
