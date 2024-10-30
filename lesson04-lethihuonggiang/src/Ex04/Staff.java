package Ex04;

import java.util.Date;

public class Staff extends Employee {
	private String department;
	private Manager manager;
	
	public Staff(String name, Date birthDay, double salaryCoefficient, double positionCoefficient, String department,
			Manager manager) {
		super(name, birthDay, salaryCoefficient, positionCoefficient);
		this.department = department;
		this.manager = manager;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public double calcSalary() {
		return (getSalaryCoefficient() + getPositionCoefficient()) * 1250000;
	}
	@Override
	public String toString() {
		return "Staff [department=" + department + ", manager=" + manager + ", getName()=" + getName()
				+ ", getBirthDay()=" + getBirthDay() + ", getSalaryCoefficient()=" + getSalaryCoefficient()
				+ ", getPositionCoefficient()=" + getPositionCoefficient() + "]";
	}
	
	

}
