package bean;

import java.time.LocalDate;

public class DepartmentHead extends Information{

	public DepartmentHead(String name, LocalDate bith, Double salary, Double titleLevel, String department) {
		super(name, bith, salary, titleLevel, department);
	}

	public DepartmentHead() {
	}

	@Override
	public String toString() {
		return "DepartmentHead [toString()=" + super.toString() + "]";
	}
}
