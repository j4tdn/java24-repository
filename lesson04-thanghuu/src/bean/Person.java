package bean;

public abstract class Person implements ILuong {

	private String name;
	private String birtday;
	private Double rangeSalary;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String birtday, Double rangeSalary) {
		super();
		this.name = name;
		this.birtday = birtday;
		this.rangeSalary = rangeSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirtday() {
		return birtday;
	}

	public void setBirtday(String birtday) {
		this.birtday = birtday;
	}

	public Double getRangeSalary() {
		return rangeSalary;
	}

	public void setRangeSalary(Double rangeSalary) {
		this.rangeSalary = rangeSalary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birtday=" + birtday + ", rangeSalary=" + rangeSalary + "]";
	}

}
