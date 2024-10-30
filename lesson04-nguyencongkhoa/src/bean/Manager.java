package bean;

import java.time.LocalDate;

public class Manager extends BaseEmployee implements PositionCoefficient, Department {

	private double positionCoefficient;
	private String department;

	public Manager() {
	}

	public Manager(String name, LocalDate birthday, double salaryCoefficient, double positionCoefficient,
			String department) {
		super(name, birthday, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
		this.department = department;
	}

	@Override
	public String getDepartment() {
		return department;
	}

	@Override
	public double getPositionCofficient() {
		return positionCoefficient;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setPositionCoefficient(Double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public long salary() {
		return (long) (salaryCoefficient + positionCoefficient) * 2200000;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", birthday=" + birthday + ", salaryCoefficient=" + salaryCoefficient
				+ ", positionCoefficient=" + positionCoefficient + ", department=" + department + "]";
	}

}
