package live.demo;

import java.util.Date;

public class Staff extends Person{
	
	private String nameDepartment;
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String birtDay, Double rangeSalary, String nameDepartment) {
		super(name, birtDay, rangeSalary);
		this.nameDepartment = nameDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	@Override
	public String toString() {
		return "Staff [nameDepartment=" + nameDepartment + ", getName()=" + getName() + ", getBirtDay()=" + getBirtDay()
				+ ", getRangeSalary()=" + getRangeSalary() + "]";
	}
	
	@Override
	public double salary() {
		return getRangeSalary() * 1250000;
	}
}
