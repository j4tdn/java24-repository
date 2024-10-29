package live.demo;

public class information {
	private String Name;
	private String date;
	protected Double salary;
	
	public information() {
		// TODO Auto-generated constructor stub
	}

	public information(String name, String date, Double salary) {
		Name = name;
		this.date = date;
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "information [Name=" + Name + ", date=" + date + ", salary=" + salary + "]";
	}

	
	
	

}
