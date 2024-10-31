package bean;

public class Staff extends Human {

	private String nameDepartment;
	private String nameManager;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String birthDay, Double salaryCoefficient, String nameDepartment, String nameManager) {
		super(name, birthDay, salaryCoefficient);
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
	
	public Double salaryS() {
		return getSalaryCoefficient()* 1250000;
	}

	@Override
	public String toString() {
		return "Tên nhân viên: " + getName() + ", Ngày sinh: "
				+ getBirthDay() + ", Hệ số lương: " + getSalaryCoefficient() + ", Tên đơn vị " + getNameDepartment()
				+ ", Tên trưởng phòng: " + getNameManager() + "\n";
	}
	
	
	
	

}
