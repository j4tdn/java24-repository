package bean;

import java.time.LocalDate;

public abstract class Personel {
	
	private String name;
	private LocalDate birth;
	private Double salaryRatio;
	
	public Personel() {
	}

	public Personel(String name, LocalDate birth, Double salaryRatio) {
		this.name = name;
		this.birth = birth;
		this.salaryRatio = salaryRatio;
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

	public Double getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(Double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}

	@Override
	public String toString() {
		return "Personel [name=" + name + ", birth=" + birth + ", salaryRatio=" + salaryRatio + "]";
	}
	
	
	
	abstract Double salary();
	

}
