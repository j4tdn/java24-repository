package live.demo;

import java.time.LocalDate;

public class DepartmentHead extends Inf {
	private int titleLevel;
	private String department;

	public DepartmentHead() {
	}

	public DepartmentHead(String name, LocalDate bith, double salary, int titleLevel, String department) {
		super(name, bith, salary);
		this.titleLevel = titleLevel;
		this.department = department;
	}

	public int getTitleLevel() {
		return titleLevel;
	}

	public void setTitleLevel(int titleLevel) {
		this.titleLevel = titleLevel;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "DepartmentHead [titleLevel=" + titleLevel + ", department=" + department + "]";
	}

}
