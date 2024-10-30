package bean;

public class Staff extends Employee {
    private String department;
    private Manager manager;
    
    public Staff() {
	}

	public Staff(String name, String birthDate, double salary, String department, Manager manager) {
		super(name, birthDate, salary);
		this.department = department;
		this.manager = manager;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Staff [department=" + department + ", manager=" + manager + ", getName()=" + getName()
				+ ", getBirthDate()=" + getBirthDate() + ", getSalary()=" + getSalary() + "]";
	}
    
    
}
