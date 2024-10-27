package bean;

import java.time.LocalDate;

public class Staff extends Human {

	private String department;
	private Human manager;

	public Staff() {
	}

	public Staff(String name, LocalDate birthDay, Double levelSalary, String department, Human manager) {
		super(name, birthDay, levelSalary);
		this.department = department;
		this.manager = manager;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Human getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public void salary() {
		
		Double salary = getLevelSalary() * 1250000;
		System.out.printf("%-20s %-20.2f\n", this.getName(), salary);

	}

	@Override
	public String toString() {
		return "Staff [department=" + department + ", manager=" + manager.getName() + ", getName()=" + getName()
				+ ", getBirthDay()=" + getBirthDay() + ", getLevelSalary()=" + getLevelSalary() + "]";
	}
	
	@Override
	public void printInfo() {
		System.out.printf("%-20s %-20s %-20s %-20.2f %-20s %-20s %-20s\n",
				"Nhân viên",
				this.getName(),
				this.getBirthDay(),
				this.getLevelSalary(),
				"",
				this.getDepartment(),
				this.getManager().getName());
		
	}
	

}
