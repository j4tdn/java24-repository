package live.demo;

import java.time.LocalDate;

public class Employee extends Person {
	private String department;
	Manager manager;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, LocalDate birth, double incomratio, String department, Manager manager) {
		super(name, birth, incomratio);
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
		return "Employee [department=" + department + ", manager=" + manager + "]";
	}

}
