package bean;

import java.time.LocalDate;

public class Director extends Information {

	public Director() {
	}

	public Director(String name, LocalDate bith, Double salary, Double titleLevel) {
		super(name, bith, salary, titleLevel, null);
	}

	@Override
	public String toString() {
		return "Director [getName()=" + getName() + ", getBith()=" + getBith() + ", getSalary()=" + getSalary()
				+ ", getTitleLevel()=" + getTitleLevel() + "]";
	}

}
