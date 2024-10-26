package live.demo;

public abstract class Human {
	
	private String name;
	private String birthday;
	private Double levelSalary;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, String birthday, Double levelSalary) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.levelSalary = levelSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Double getLevelSalary() {
		return levelSalary;
	}

	public void setLevelSalary(Double levelSalary) {
		this.levelSalary = levelSalary;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", birthday=" + birthday + ", levelSalary=" + levelSalary + "]";
	}
	
	
	
	

}
