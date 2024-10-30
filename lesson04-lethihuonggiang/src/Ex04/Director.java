package Ex04;

import java.util.Date;

public class Director extends Employee{

	public Director(String name, Date birthDay, double salaryCoefficient, double positionCoefficient) {
		super(name, birthDay, salaryCoefficient, positionCoefficient);
	}

	@Override
	public double calcSalary() {
		return (getSalaryCoefficient() + getPositionCoefficient()) * 3000000;
	}
	
	

}
