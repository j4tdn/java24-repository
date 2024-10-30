package exercise04;

import java.time.LocalDate;

public class Director extends Person {
	private int positionCoefficient;
	
	public Director() {
	}

	public Director(String name, LocalDate dayOfBirth, double salaryCoefficient, int positionCoefficient) {
		super(name, dayOfBirth, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
	}

	public int getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(int positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "Director [positionCoefficient=" + positionCoefficient + ", getName()=" + getName()
				+ ", getDayOfBirth()=" + getDayOfBirth() + ", getSalaryCoefficient()=" + getSalaryCoefficient() + "]";
	}
	
	
	
}
