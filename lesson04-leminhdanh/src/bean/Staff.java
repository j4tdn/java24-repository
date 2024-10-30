package bean;

import java.time.LocalDate;

public class Staff extends Information{
	private DepartmentHead departmentHead;

	public Staff() {
	}

	public Staff(String name, LocalDate bith, Double salary, String department, DepartmentHead departmentHead) {
		super(name, bith, salary, null, department);
		this.departmentHead = departmentHead;
	}

	public DepartmentHead getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(DepartmentHead departmentHead) {
		this.departmentHead = departmentHead;
	}

	@Override
	public String toString() {
		return "Staff [departmentHead=" + departmentHead + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
