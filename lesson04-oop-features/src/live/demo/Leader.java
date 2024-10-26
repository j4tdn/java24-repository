package live.demo;

import java.time.LocalDate;

public class Leader extends Person {

	public Leader() {
		// TODO Auto-generated constructor stub
	}

	public Leader(String name, LocalDate birth, Double salaryCoefficient, Integer position, String workUnit) {
		super(name, birth, salaryCoefficient, position, workUnit);
	}

	@Override
	public Double salaryInDouble() {
		double totalMoney = (this.getSalaryCoefficient() * this.getPosition()) * 2200000;
		return totalMoney;
	}

	@Override
	public String toString() {
		return "Leader [getName()=" + getName() + ", getBirth()=" + getBirth() + ", getSalaryCoefficient()="
				+ getSalaryCoefficient() + ", getPosition()=" + getPosition() + ", getWorkUnit()=" + getWorkUnit()
				+ "]";
	}

}
