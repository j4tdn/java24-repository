package bean;

import java.time.LocalDate;

public class Director extends BaseEmployee implements PositionCoefficient{
	
	private double positionCoefficient;
	
	public Director() {
	}

	public Director(String name, LocalDate birthday, double salaryCoefficient, double positionCoefficient) {
		super(name, birthday, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
	}
	
	@Override
	public double getPositionCofficient() {
		return positionCoefficient;
	}
	
	public Double getPositionCoefficient() {
		return positionCoefficient;
	}
	
	@Override
	public long salary() {
		return (long) (salaryCoefficient + positionCoefficient) * 3000000;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", birthday=" + birthday+ ", salaryCoefficient=" + salaryCoefficient
				+ "positionCoefficient=" + positionCoefficient +  "]";
	}
	
}
