package live.demo;

import java.time.LocalDate;

public class Manager extends Person {
	public Manager() {
	}

	public Manager(String name, LocalDate birth, Double salaryCoefficient, Double position) {
		super(name, birth, salaryCoefficient, position);
	}

	@Override
	public double salaryInDouble() {
		double totalMoney = (this.getSalaryCoefficient() * this.getPosition()) * 3000000;
		return totalMoney;
	}

	@Override
	public String toString() {
		return "Manager [getName()=" + getName() + ", getBirth()=" + getBirth() + ", getSalaryCoefficient()="
				+ getSalaryCoefficient() + ", getPosition()=" + getPosition() + "]";
	}

}
