package bean;

public class Manager extends Employee {
    private double positionFactor;
    private String department;
    
    public Manager() {
	}

	public Manager(String name, String birthDate, double salary, double positionFactor, String department) {
		super(name, birthDate, salary);
		this.positionFactor = positionFactor;
		this.department = department;
	}

	public double getPositionFactor() {
		return positionFactor;
	}

	public void setPositionFactor(double positionFactor) {
		this.positionFactor = positionFactor;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [positionFactor=" + positionFactor + ", department=" + department + ", getName()=" + getName()
				+ ", getBirthDate()=" + getBirthDate() + ", getSalary()=" + getSalary() + "]";
	}
}
