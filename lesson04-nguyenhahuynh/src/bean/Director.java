package bean;

public class Director extends Employee {
	private double positionFactor;
	
	public Director() {
	}

	public Director(String name, String birthDate, double salary, double positionFactor) {
		super(name, birthDate, salary);
		this.positionFactor = positionFactor;
	}

	public double getPositionFactor() {
		return positionFactor;
	}

	public void setPositionFactor(double positionFactor) {
		this.positionFactor = positionFactor;
	}

	@Override
	public String toString() {
		return "Director [positionFactor=" + positionFactor + ", getName()=" + getName() + ", getBirthDate()="
				+ getBirthDate() + ", getSalary()=" + getSalary() + "]";
	}
	
}
