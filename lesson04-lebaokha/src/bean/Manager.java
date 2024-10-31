package bean;

public class Manager extends Human {

	private Double positionCoefficient;
	private String nameDepartment;

	public Manager() {

	}

	public Manager(String name, String birthDay, Double salaryCoefficient, Double positionCoefficient,
			String nameDepartment) {
		super(name, birthDay, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
		this.nameDepartment = nameDepartment;
	}

	public Double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(Double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	
	public Double salaryM() {
		return (getSalaryCoefficient()+getPositionCoefficient()) * 2200000;
	}

	@Override
	public String toString() {
		return "Tên trường phòng: " + getName() + ", Ngày sinh: "
				+ getBirthDay() + ", Hệ số lương: " + getSalaryCoefficient() + ", Hệ số chức vụ: " + getPositionCoefficient()
				+ ", Tên đơn vị: " + getNameDepartment() + "\n";
	}

}
