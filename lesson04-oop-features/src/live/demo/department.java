package live.demo;

public class department extends information {
	private String position;
	private String unit;
	
	public department() {
		// TODO Auto-generated constructor stub
	}

	public department(String name, String date, Double salary, String position, String unit) {
		super(name, date, salary);
		this.position = position;
		this.unit = unit;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "department [position=" + position + ", unit=" + unit + ", getName()=" + getName() + ", getDate()="
				+ getDate() + ", getSalary()=" + getSalary() + "]";
	}
	

}
