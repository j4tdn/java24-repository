package bean;

public class Human {
	private String name;
	private String birthDay;
	private Double salaryCoefficient;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, String birthDay, Double salaryCoefficient) {
		this.name = name;
		this.birthDay = birthDay;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public Double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(Double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", birthDay=" + birthDay + ", salaryCoefficient=" + salaryCoefficient + "]";
	}
	
	

}
