package live.demo;

import java.time.LocalDate;

public class Staff extends Inf {
	private String department;
	private DepartmentHead departmentHead;

	public Staff() {
	}

	public Staff(String name, LocalDate bith, double salary, String department, DepartmentHead departmentHead) {
		super(name, bith, salary);
		this.department = department;
		this.departmentHead = departmentHead;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public DepartmentHead getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(DepartmentHead departmentHead) {
		this.departmentHead = departmentHead;
	}

	@Override
	public String toString() {
		return "Staff [department=" + department + ", departmentHead=" + departmentHead + "]";
	}

}
