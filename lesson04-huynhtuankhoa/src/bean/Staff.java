package bean;

import java.time.LocalDate;

public class Staff extends Person{
	private String departmentName;
	private Manager manager;
	
	
	public Staff(String fullName, LocalDate dateOfBirth, int salaryScale, String departmentName, Manager manager) {
		super(fullName, dateOfBirth, salaryScale);
		this.departmentName = departmentName;
		this.manager = manager;
	}
	
	public Manager getManager() {
		return manager;
	}
	
	public String getName() {
		return fullName;
	}
	
	@Override
	public double calSalary() {
		return salaryScale * 1250000;
	}
	
	@Override 
	public String displayInfo() {
		return "Name: " + fullName + "\n" +
			   "Date of birth: " + dateOfBirth + "\n" +
			   "Salary scale: " + salaryScale + "\n" +
			   "Salary: " + calSalary();
	}
	
	
	
}
