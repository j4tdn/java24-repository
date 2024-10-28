package bean;

import java.time.LocalDate;

public class Director extends Person{
	private int posiScale;
	
	
	public Director(String fullName, LocalDate dateOfBirth, int salaryScale, int posiScale) {
		super(fullName, dateOfBirth, salaryScale);
		this.posiScale = posiScale;
	}
	
	public String getName() {
		return fullName;
	}


	@Override
	public double calSalary() {
		return (salaryScale + posiScale) * 3000000;
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
