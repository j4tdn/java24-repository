package live;

import java.time.LocalDate;

public class Employee extends Profile {
	private HeadQuarter manager;

	public Employee() {
	}

	public Employee(String name, LocalDate birth, double salaryRanking, String department, HeadQuarter manager) {
		super(name, birth, salaryRanking, department);
		this.manager = manager;
	}

	public HeadQuarter getManager() {
		return manager;
	}

	public void setManager(HeadQuarter manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [manager=" + manager + ", " + super.toString() + "]";
	}

}
