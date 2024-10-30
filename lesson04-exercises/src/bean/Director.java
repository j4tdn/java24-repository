package bean;

import java.time.LocalDate;

public class Director extends Human {
	public Director() {
	}

	public Director(String name, LocalDate birth, Double salaryRanking, Double levelRanking) {
		super(name, birth, salaryRanking, levelRanking);
	}

	@Override
	public double salaryCalc(Human h) {
		if (h.getLevelRanking() > 0) {
			return h.getLevelRanking() * h.getSalaryRanking() * 3000000;
		}
		return h.getSalaryRanking() * 3000000;

	}

	@Override
	public String toString() {
		return "Director [getName()=" + getName() + ", getBirth()=" + getBirth() + ", getSalaryRanking()="
				+ getSalaryRanking() + ", getLevelRanking()=" + getLevelRanking() + "]";
	}

}
