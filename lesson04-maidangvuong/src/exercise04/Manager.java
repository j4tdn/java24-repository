package exercise04;

import java.time.LocalDate;

public class Manager extends Person {
	private String nameOfDeparment;
	private int positionCoefficient;
	
	public Manager() {
	}

	public Manager(String name, LocalDate dayOfBirth, double salaryCoefficient, String nameOfDeparment,
			int positionCoefficient) {
		super(name, dayOfBirth, salaryCoefficient);
		this.nameOfDeparment = nameOfDeparment;
		this.positionCoefficient = positionCoefficient;
	}

	public String getNameOfDeparment() {
		return nameOfDeparment;
	}

	public void setNameOfDeparment(String nameOfDeparment) {
		this.nameOfDeparment = nameOfDeparment;
	}

	public int getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(int positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "Manager [nameOfDeparment=" + nameOfDeparment + ", positionCoefficient=" + positionCoefficient
				+ ", getName()=" + getName() + ", getDayOfBirth()=" + getDayOfBirth() + ", getSalaryCoefficient()="
				+ getSalaryCoefficient() + "]";
	}
	
	
	
}
