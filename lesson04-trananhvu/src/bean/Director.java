package bean;

import java.time.LocalDate;

public class Director extends BaseEmployee {

	@Override
	public double totalSalary() {
		return (getSalaryLevel() + getRegencyLevel()) * 3000000;
	}

	@Override
	public double getTotalSalary() {
		return totalSalary();
	}

	public Director() {
	}

	public Director(String name, LocalDate birthday, double salaryLevel, double regencyLevel) {
		super(name, birthday, salaryLevel, regencyLevel);
	}

	@Override
	public String toString() {
		return "Director [getName()=" + getName() + ", getBirthday()=" + getBirthday() + ", getSalaryLevel()="
				+ getSalaryLevel() + ", getRegencyLevel()=" + getRegencyLevel() + "]";
	}

}
