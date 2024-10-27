package live.demo;

public abstract class Person implements ILuong{
	private String name;
	private String birtDay;
	private Double rangeSalary;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String birtDay, Double rangeSalary) {
		this.name = name;
		this.birtDay = birtDay;
		this.rangeSalary = rangeSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirtDay() {
		return birtDay;
	}

	public void setBirtDay(String birtDay) {
		this.birtDay = birtDay;
	}

	public Double getRangeSalary() {
		return rangeSalary;
	}

	public void setRangeSalary(Double rangeSalary) {
		this.rangeSalary = rangeSalary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birtDay=" + birtDay + ", rangeSalary=" + rangeSalary + "]";
	}
	
	
}
