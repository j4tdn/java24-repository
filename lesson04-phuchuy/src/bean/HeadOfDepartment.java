package bean;

import java.time.LocalDate;

public class HeadOfDepartment extends Human {
	public HeadOfDepartment() {
		// TODO Auto-generated constructor stub
	}

	public HeadOfDepartment(String name, LocalDate birth, Double salaryRanking, Double levelRanking,
			String department) {
		super(name, birth, salaryRanking, levelRanking, department);
	}

	@Override
	public double salaryCalc(Human h) {
		if (h.getLevelRanking() > 0) {
			return h.getLevelRanking() * h.getSalaryRanking() * 2200000;
		}
		return h.getSalaryRanking() * 2200000;

	}

	@Override
	public String toString() {
		return "HeadOfDepartment [getName()=" + getName() + ", getBirth()=" + getBirth() + ", getSalaryRanking()="
				+ getSalaryRanking() + ", getLevelRanking()=" + getLevelRanking() + ", getDepartment()="
				+ getDepartment() + "]";
	}

}
