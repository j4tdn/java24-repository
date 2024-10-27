package live.demo;

public class Precident extends Person{
	
	private Double rangePosition;
	
	public Precident() {
		// TODO Auto-generated constructor stub
	}
	
	public Precident(String name, String birtDay, Double rangeSalary, Double rangePosition) {
		super(name, birtDay, rangeSalary);
		this.rangePosition = rangePosition;
	}

	public Double getRangePosition() {
		return rangePosition;
	}

	public void setRangePosition(Double rangePosition) {
		this.rangePosition = rangePosition;
	}
	
	
	@Override
	public String toString() {
		return "Precident [rangePosition=" + rangePosition + ", getName()=" + getName() + ", getBirtDay()="
				+ getBirtDay() + ", getRangeSalary()=" + getRangeSalary() + "]";
	}

	@Override
	public double salary() {
		return (getRangeSalary() + rangePosition) * 3000000;
	}
}
