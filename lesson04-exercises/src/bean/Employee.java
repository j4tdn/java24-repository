package bean;

import java.time.LocalDate;

public class Employee extends Human {
	private HeadOfDepartment info;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, LocalDate birth, Double salaryRanking, String department, HeadOfDepartment info) {
		super(name, birth, salaryRanking, department);
		this.info = info;
	}

	public HeadOfDepartment getInfo() {
		return info;
	}

	public void setInfo(HeadOfDepartment info) {
		this.info = info;
	}

	public double salaryCalc(Human h) {
		if (h.getLevelRanking() > 0) {
			return h.getLevelRanking() * h.getSalaryRanking() * 1250000;
		}
		return h.getSalaryRanking() * 1250000;

	}

	@Override
	public String toString() {
		return "Employee [info=" + info + ", getName()=" + getName() + ", getBirth()=" + getBirth()
				+ ", getSalaryRanking()=" + getSalaryRanking() + ", getDepartment()=" + getDepartment() + "]";
	}

}
