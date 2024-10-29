package live.demo;

public class manager extends information {
	private String position;
	
	public manager() {
		// TODO Auto-generated constructor stub
	}

	

	public manager(String name, String date, Double salary, String position) {
		super(name, date, salary);
		this.position = position;
	}



	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "manager [position=" + position + ", getName()=" + getName() + ", getDate()=" + getDate()
				+ ", getSalary()=" + getSalary() + "]";
	}
	
	

}
