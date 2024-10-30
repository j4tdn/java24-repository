package bean;

import java.time.LocalDate;

public abstract class Shared {
	private String name;
	private LocalDate  day;
	private Double salaryCoefficient;
	
	public Shared() {
		// TODO Auto-generated constructor stub
	}

	public Shared(String name, LocalDate day, Double salaryCoefficient) {
		this.name = name;
		this.day = day;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	public Double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(Double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	@Override
	public String toString() {
		return "Shared [name=" + name + ", day=" + day + ", salaryCoefficient=" + salaryCoefficient + "]";
	}
	

	
	
	

}
