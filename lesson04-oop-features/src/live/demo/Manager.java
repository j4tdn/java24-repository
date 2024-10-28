package live.demo;

import java.time.LocalDate;



public class Manager extends Information{
	private String unitName;

	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(String fullName, LocalDate birthOfDate, Double salary, Double positionCoefficient, String unitName) {
		super(fullName, birthOfDate, salary, positionCoefficient);
		this.unitName = unitName;
	}
	
}	
