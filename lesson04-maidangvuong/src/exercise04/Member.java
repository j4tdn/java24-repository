package exercise04;

import java.time.LocalDate;

public class Member extends Person{
	
	private String nameOfDepartment;
	private Manager ManagerName;
	
	
	public Member(String name, LocalDate dayOfBirth, double salaryCoefficient) {
	}

	public Member(String name, LocalDate dayOfBirth, double salaryCoefficient, String nameOfDepartment) {
		this(name, dayOfBirth, salaryCoefficient);
		this.nameOfDepartment = nameOfDepartment;
	}

	@Override
	public String toString() {
		return "Member [nameOfDepartment=" + nameOfDepartment + ", getName()=" + getName() + ", getDayOfBirth()="
				+ getDayOfBirth() + ", getSalaryCoefficient()=" + getSalaryCoefficient() + "]";
	}
	
	
	

}
