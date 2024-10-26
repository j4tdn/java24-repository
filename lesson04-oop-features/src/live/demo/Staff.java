package live.demo;

public class Staff extends Human {

	private String unitName;
	private HeadOfDepartment headName;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String birthday, Double levelSalary, String unitName, HeadOfDepartment headName) {
		super(name, birthday, levelSalary);
		this.unitName = unitName;
		this.headName = headName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public HeadOfDepartment getHeadName() {
		return headName;
	}

	public void setHeadName(HeadOfDepartment headName) {
		this.headName = headName;
	}

	@Override
	public String toString() {
		return "Staff [unitName=" + unitName + ", headName=" + headName + ", getName()=" + getName()
				+ ", getBirthday()=" + getBirthday() + ", getLevelSalary()=" + getLevelSalary() + "]";
	}

}
