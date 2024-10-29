package live.demo;

import java.time.LocalDate;

public class Director extends Inf {
	private int titleLevel;

	public Director() {
	}

	public Director(String name, LocalDate bith, double salary, int titleLevel) {
		super(name, bith, salary);
		this.titleLevel = titleLevel;
	}

	public int getTitleLevel() {
		return titleLevel;
	}

	public void setTitleLevel(int titleLevel) {
		this.titleLevel = titleLevel;
	}

	@Override
	public String toString() {
		return "Director [titleLevel=" + titleLevel + "]";
	}

}
