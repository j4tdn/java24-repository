package bean;

public class President extends Human {

	private Double positionCoefficient;

	public President() {
		// TODO Auto-generated constructor stub
	}

	public President(String name, String birthDay, Double salaryCoefficient, Double positionCoefficient) {
		super(name, birthDay, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
	}

	public Double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(Double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	public Double salaryP() {
		return (getSalaryCoefficient()+getPositionCoefficient()) * 3000000;
	}

	@Override
	public String toString() {
		return "Tên giám đốc: " + getName() + ", Ngày sinh: " + getBirthDay() + ", Hệ số lương: "
				+ getSalaryCoefficient() + ", Hệ số chức vụ: " + getPositionCoefficient() + "\n";
	}

}
