package live.demo;

import java.time.LocalDate;

public abstract class Person {
	private String name;
	private LocalDate birth;
	private double incomratio;
	private double titleLevel;

	public Person() {
		// TODO Auto-generated constructor stub

	}

	public Person(String name, LocalDate birth, double incomratio, double titleLevel) {
		super();
		this.name = name;
		this.birth = birth;
		this.incomratio = incomratio;
		this.titleLevel = titleLevel;
	}

	public Person(String name, LocalDate birth, double incomratio) {
		super();
		this.name = name;
		this.birth = birth;
		this.incomratio = incomratio;
		this.titleLevel = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public double getIncomratio() {
		return incomratio;
	}

	public void setIncomratio(double incomratio) {
		this.incomratio = incomratio;
	}

	public double getTitleLevel() {
		return titleLevel;
	}

	public void setTitleLevel(double titleLevel) {
		this.titleLevel = titleLevel;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birth=" + birth + ", incomratio=" + incomratio + ", titleLevel=" + titleLevel
				+ "]";
	}

}
