package Ex04;

import java.util.Date;

public class Manager extends Employee {
	private String department;

	public Manager(String name, Date birthDay, double salaryCoefficient, double positionCoefficient,
			String department) {
		super(name, birthDay, salaryCoefficient, positionCoefficient);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public double calcSalary() {
	 return (getSalaryCoefficient() + getPositionCoefficient()) * 2200000;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", getName()=" + getName() + ", getBirthDay()=" + getBirthDay()
				+ ", getSalaryCoefficient()=" + getSalaryCoefficient() + ", getPositionCoefficient()="
				+ getPositionCoefficient() + "]";
	}
	
}
