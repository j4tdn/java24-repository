package bean;

public class Employee {
    private String name;
    private String birthDate;
    private double salary;
    
    public Employee() {
	}

	public Employee(String name, String birthDate, double salary) {
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthDate=" + birthDate + ", salary=" + salary + "]";
	}
}
