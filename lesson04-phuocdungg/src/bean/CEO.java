package bean;

import java.time.LocalDate;

public class CEO extends Human {

	private Double ranking;

	public CEO() {

	}

	public CEO(String name, LocalDate birthDay, Double levelSalary, Double ranking) {
		super(name, birthDay, levelSalary);
		this.ranking = ranking;
	}

	public Double getRanking() {
		return ranking;
	}

	public void setRanking(Double ranking) {
		this.ranking = ranking;
	}

	@Override
	public void salary() {

		Double salary = (getLevelSalary() + ranking) * 3000000;
		System.out.printf("%-20s %-20.2f\n", this.getName(), salary);

	}

	@Override
	public String toString() {
		return "CEO [ranking=" + ranking + ", getName()=" + getName() + ", getBirthDay()=" + getBirthDay()
				+ ", getLevelSalary()=" + getLevelSalary() + "]";
	}
	
	public void printInfo() {
		System.out.printf("%-20s %-20s %-20s %-20.2f %-20.2f %-20s %-20s\n",
				"Giám đốc",
				this.getName(),
				this.getBirthDay(),
				this.getLevelSalary(),
				this.getRanking(),
				"",
				"");
		
	}
}
