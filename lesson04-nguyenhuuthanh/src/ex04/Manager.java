package ex04;

public class Manager extends People implements PositionCoefficient {
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String name, String dateOfBith, double salaryCoefficient) {
		super(name, dateOfBith, salaryCoefficient);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Giám đốc Tên :" + getName() + ", Ngày sinh :" + getDateOfBith() + ", Hệ số lương :"
				+ getSalaryCoefficient() + ", Hệ số chức vụ :" + PosCoefficient() ;
	}

	@Override
	double payRoll() {
		// TODO Auto-generated method stub
		return (getSalaryCoefficient() + PosCoefficient())*3000000;
	}
	@Override
	public int PosCoefficient() {
		// TODO Auto-generated method stub
		return 3;
	}
}
