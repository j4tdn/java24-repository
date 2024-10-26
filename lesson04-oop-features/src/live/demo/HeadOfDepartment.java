package live.demo;

public class HeadOfDepartment extends Human {

	private Double levelDuty;

	public HeadOfDepartment() {
		// TODO Auto-generated constructor stub
	}

	public HeadOfDepartment(String name, String birthday, Double levelSalary, Double levelDuty) {
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
		return "HeadOfDepartment [levelDuty=" + levelDuty + ", getName()=" + getName() + ", getBirthday()="
				+ getBirthday() + ", getLevelSalary()=" + getLevelSalary() + "]";
	}

}
