package live.demo;

public class CEO extends Human {

	private Double levelDuty;

	public CEO() {
		// TODO Auto-generated constructor stub
	}

	public CEO(String name, String birthday, Double levelSalary, Double levelDuty) {
		super(name, birthday, levelSalary);
		this.levelDuty = levelDuty;
	}

	public Double getLevelDuty() {
		return levelDuty;
	}

	public void setLevelDuty(Double levelDuty) {
		this.levelDuty = levelDuty;
	}

	@Override
	public String toString() {
		return "CEO [levelDuty=" + levelDuty + ", getName()=" + getName() + ", getBirthday()=" + getBirthday()
				+ ", getLevelSalary()=" + getLevelSalary() + "]";
	}

}
