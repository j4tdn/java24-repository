package bean;

import java.time.LocalDate;

public class Manager extends Human {

	private Double ranking;
	private String department;

	public Manager() {

	}

	public Manager(String name, LocalDate birthDay, Double levelSalary, Double ranking, String department) {
		super(name, birthDay, levelSalary);
		this.ranking = ranking;
		this.department = department;
	}

	public Double getRanking() {
		return ranking;
	}

	public void setRanking(Double ranking) {
		this.ranking = ranking;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void salary() {

		Double salary = (getLevelSalary() + ranking) * 2200000;
		System.out.printf("%-20s %-20.2f\n", this.getName(), salary);

	}

	@Override
	public String toString() {
		return "Manager [ranking=" + ranking + ", department=" + department + ", getName()=" + getName()
				+ ", getBirthDay()=" + getBirthDay() + ", getLevelSalary()=" + getLevelSalary() + "]";
	}
	
	public void printInfo() {
		System.out.printf("%-20s %-20s %-20s %-20.2f %-20.2f %-20s %-20s\n",
				"Trưởng phòng",
				this.getName(),
				this.getBirthDay(),
				this.getLevelSalary(),
				this.getRanking(),
				this.getDepartment(),
				"");
		
	}

}
