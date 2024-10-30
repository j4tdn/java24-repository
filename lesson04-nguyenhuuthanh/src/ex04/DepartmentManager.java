package ex04;

public class DepartmentManager extends People implements PositionCoefficient {
	private String unitName;
	
	public DepartmentManager() {
		// TODO Auto-generated constructor stub
	}
	
	public DepartmentManager(String name, String dateOfBirth, double salaryCoefficient, String unitName) {
        super(name, dateOfBirth, salaryCoefficient);
        this.unitName = unitName;
    }
	
	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public String toString() {
		return "Trưởng phòng Tên :" + getName() + ", Ngày sinh :" + getDateOfBith() + ", Hệ số lương :"
				+ getSalaryCoefficient() + ", Hệ số chức vụ :" + PosCoefficient() +", Tên đơn vị:" + getUnitName() ;
	}

	@Override
	double payRoll() {
		
		return (getSalaryCoefficient() + PosCoefficient())*2200000;
	}
	@Override
	public int PosCoefficient() {
		// TODO Auto-generated method stub
		return 2;
	}
}
