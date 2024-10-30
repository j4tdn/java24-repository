package ex04;

public abstract class People {
	private String name;
	private String dateOfBith;
	private double salaryCoefficient;
	
	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String name, String dateOfBith, double salaryCoefficient) {
		this.name = name;
		this.dateOfBith = dateOfBith;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBith() {
		return dateOfBith;
	}

	public void setDateOfBith(String dateOfBith) {
		this.dateOfBith = dateOfBith;
	}

	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	abstract double payRoll();

	@Override
	public String toString() {
		return "People [name=" + name + ", dateOfBith=" + dateOfBith + ", salaryCoefficient=" + salaryCoefficient + "]";
	}
	

}
