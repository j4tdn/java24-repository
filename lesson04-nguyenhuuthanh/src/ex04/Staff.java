package ex04;

public class Staff extends People{
	private String departmentManager;
	private String unitName;
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	
	  public Staff(String name, String dateOfBirth, double salaryCoefficient, String unitName, String departmentManager) {
	        super(name, dateOfBirth, salaryCoefficient);
	        this.unitName = unitName;
	        this.departmentManager = departmentManager;
	    }

	public String getDepartmentManager() {
		return departmentManager;
	}
	public void setDepartmentManager(String departmentManager) {
		this.departmentManager = departmentManager;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	
	
	@Override
	public String toString() {
		return "Nhân viên Tên : " + getName()+ ", Ngày sinh :" + getDateOfBith() + ", Hệ số lương :" + getSalaryCoefficient() +", Tên đơn vị :" + unitName + ", Trưởng phòng :" + departmentManager ;
	}

	@Override
	double payRoll() {
		// TODO Auto-generated method stub
		return getSalaryCoefficient() * 1250000;
	}

	

}
