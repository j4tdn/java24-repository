package bean;

public class Manager extends Person{

	private Double rangePosition;
	private String nameDepartment;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String birtday, Double rangeSalary, Double rangePosition, String nameDepartment) {
		super(name, birtday, rangeSalary);
		this.rangePosition = rangePosition;
		this.nameDepartment = nameDepartment;
	}

	public Double getRangePosition() {
		return rangePosition;
	}

	public void setRangePosition(Double rangePosition) {
		this.rangePosition = rangePosition;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	@Override
	public String toString() {
		return "Manager [rangePosition=" + rangePosition + ", nameDepartment=" + nameDepartment + ", getName()="
				+ getName() + ", getBirtday()=" + getBirtday() + ", getRangeSalary()=" + getRangeSalary() + "]";
	}
	
	@Override
	public double salary() {
		return (getRangeSalary() + getRangePosition()) * 2200000;
	}
}
