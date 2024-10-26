package live.demo;

import java.time.LocalDate;

public class Manager extends Person {
	private String department;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, LocalDate birth, double incomratio, double titleLevel, String department) {
		super(name, birth, incomratio, titleLevel);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + "]";
	}

}
