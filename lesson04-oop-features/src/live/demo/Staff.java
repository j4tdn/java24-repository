package live.demo;

public class Staff extends information {
	private String unit;
	private String department;
	
	public Staff(String name, String date, Double salary, String unit, String department) {
		super(name, date, salary);
		this.unit = unit;
		this.department = department;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Staff [unit=" + unit + ", department=" + department + ", getName()=" + getName() + ", getDate()="
				+ getDate() + ", getSalary()=" + getSalary() + "]";
	}
	
	
	

}
