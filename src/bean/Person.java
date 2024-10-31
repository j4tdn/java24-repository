package bean;

import java.time.LocalDate;

public abstract class Person {
	protected String fullName;
	protected LocalDate dateOfBirth;
	protected int salaryScale;
	
	public Person(String fullName, LocalDate dateOfBirth, int salaryScale) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.salaryScale = salaryScale;
	}
	

	public abstract double calSalary();
	public abstract String displayInfo();
}
