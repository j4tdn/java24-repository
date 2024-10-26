package live.demo;

public class Staff extends Nguoi {
	private String unit;
	private String departmenthead;
	public Staff() {
		super();
	}
	public Staff(String unit, String departmenthead) {
		super();
		this.unit = unit;
		this.departmenthead = departmenthead;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getDepartmenthead() {
		return departmenthead;
	}
	public void setDepartmenthead(String departmenthead) {
		this.departmenthead = departmenthead;
	}
	@Override
	void wage() {
		System.out.println();
		
	}
	
	
	
}
