package bean;

import java.time.LocalDate;

public class Manager extends BaseEmployee {
	private int totalEmloyeesManaged;
	private String department;

	@Override
	public double totalSalary() {

		return (getSalaryLevel() + getRegencyLevel()) * 2200000;
	}

	@Override
	public double getTotalSalary() {
		return totalSalary();
	}

	public Manager() {
	}

	public Manager(String name, LocalDate birthday, double salaryLevel, double regencyLevel, String department) {
		super(name, birthday, salaryLevel, regencyLevel);
		this.department = department;
		this.totalEmloyeesManaged = 0;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getTotalEmloyeesManaged() {
		return totalEmloyeesManaged;
	}

	public void setTotalEmloyeesManaged(int totalEmloyeesManaged) {
		this.totalEmloyeesManaged = totalEmloyeesManaged;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", getName()=" + getName() + ", getBirthday()=" + getBirthday()
				+ ", getSalaryLevel()=" + getSalaryLevel() + ", getRegencyLevel()=" + getRegencyLevel() + "]";
	}

}
