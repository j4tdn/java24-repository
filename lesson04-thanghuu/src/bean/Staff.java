package bean;

public class Staff extends Person {

	private String nameDepartment;
	private String nameManager;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String birtday, Double rangeSalary, String nameDepartment, String nameManager) {
		super(name, birtday, rangeSalary);
		this.nameDepartment = nameDepartment;
		this.nameManager = nameManager;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public String getNameManager() {
		return nameManager;
	}

	public void setNameManager(String nameManager) {
		this.nameManager = nameManager;
	}

	@Override
	public String toString() {
		return "Staff [nameDepartment=" + nameDepartment + ", nameManager=" + nameManager + ", getName()=" + getName()
				+ ", getBirtday()=" + getBirtday() + ", getRangeSalary()=" + getRangeSalary() + "]";
	}

	@Override
	public double salary() {
		return getRangeSalary() * 1250000;
	}

}
