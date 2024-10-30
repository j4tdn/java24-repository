package live.demo;

import java.text.DateFormat;

public class ChairMan {
	
	private String name;
	private DateFormat dayOfBirth;
	private Double salaryPercentage;
	private Double functionPercentage;
	
	public ChairMan() {
		
	}

	public ChairMan(String name, DateFormat dayOfBirth, Double salaryPercentage, Double functionPercentage) {
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.salaryPercentage = salaryPercentage;
		this.functionPercentage = functionPercentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DateFormat getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(DateFormat dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public Double getSalaryPercentage() {
		return salaryPercentage;
	}

	public void setSalaryPercentage(Double salaryPercentage) {
		this.salaryPercentage = salaryPercentage;
	}

	public Double getFunctionPercentage() {
		return functionPercentage;
	}

	public void setFunctionPercentage(Double functionPercentage) {
		this.functionPercentage = functionPercentage;
	}

	@Override
	public String toString() {
		return "ChairMan [name=" + name + ", dayOfBirth=" + dayOfBirth + ", salaryPercentage=" + salaryPercentage
				+ ", functionPercentage=" + functionPercentage + "]";
	}

	

	
	
}
