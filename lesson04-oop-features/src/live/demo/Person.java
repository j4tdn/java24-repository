package live.demo;

import java.time.LocalDate;

public abstract class Person {

	private String name;
	private LocalDate birth;
	private Double salaryCoefficient;
	private Double position;
	private String workUnit;

	public abstract double salaryInDouble();

	public Person() {
	}

	public Person(String name, LocalDate birth, Double salaryCoefficient, String workUnit) {
		super();
		this.name = name;
		this.birth = birth;
		this.salaryCoefficient = salaryCoefficient;
		this.workUnit = workUnit;
	}

	public Person(String name, LocalDate birth, Double salaryCoefficient, Double position) {
		super();
		this.name = name;
		this.birth = birth;
		this.salaryCoefficient = salaryCoefficient;
		this.position = position;
	}

	public Person(String name, LocalDate birth, Double salaryCoefficient, Double position, String workUnit) {
		super();
		this.name = name;
		this.birth = birth;
		this.salaryCoefficient = salaryCoefficient;
		this.position = position;
		this.workUnit = workUnit;
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

	public Double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(Double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public Double getPosition() {
		return position;
	}

	public void setPosition(Double position) {
		this.position = position;
	}

	public String getWorkUnit() {
		return workUnit;
	}

	public void setWorkUnit(String workUnit) {
		this.workUnit = workUnit;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birth=" + birth + ", salaryCoefficient=" + salaryCoefficient + ", position="
				+ position + ", workUnit=" + workUnit + "]";
	}

}
