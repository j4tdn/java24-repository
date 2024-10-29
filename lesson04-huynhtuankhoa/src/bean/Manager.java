package bean;

import java.time.LocalDate;

public class Manager extends Person{
	private int posiScale;
	private String departmentName;
	
	public Manager(String fullName, LocalDate dateOfBirth, int salaryScale, int posiScale, String departmentName) {
		super(fullName, dateOfBirth, salaryScale);
		this.posiScale = posiScale;
		this.departmentName = departmentName;
	}
	
	public String getName() {
		return fullName;
	}
	
	@Override
	public double calSalary() {
		return (salaryScale + posiScale) * 2200000;
	}
	
	@Override 
	public String displayInfo() {
		return "Name: " + fullName + "\n" +
			   "Date of birth: " + dateOfBirth + "\n" +
			   "Salary scale: " + salaryScale + "\n" + 
			   "Position scale: " + posiScale + "\n" + 
			   "Salary: " + calSalary();
	}
	
	
}
