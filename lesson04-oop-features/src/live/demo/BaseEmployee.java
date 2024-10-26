package live.demo;

import java.time.LocalDate;

public abstract class BaseEmployee {
	
	protected String name;
	protected LocalDate birthDay;
	protected double salary;

	
	
	
	public BaseEmployee() {
	}

	public BaseEmployee(String name, LocalDate birthDay, double salary) {
		this.name = name;
		this.birthDay = birthDay;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthDay=" + birthDay + ", salary=" + salary + "]";
	}
	
}
