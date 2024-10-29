package live.demo;

import java.time.LocalDate;

public class headOfDepartment extends Chief {
	
	private String devisionName;
	
	public headOfDepartment() {
		// TODO Auto-generated constructor stub
	}
	
	

	public headOfDepartment(String name, LocalDate birht, double incomeratio, double titleratio, String devisionName) {
		super(name, birht, incomeratio, titleratio);
		this.devisionName = devisionName;
	}

	public String getDevisionName() {
		return devisionName;
	}

	public void setDevisionName(String devisionName) {
		this.devisionName = devisionName;
	}

	@Override
	public String toString() {
		return "headOfDepartment [devisionName=" + devisionName + ", getTitleratio()=" + getTitleratio()
				+ ", toString()=" + super.toString() + ", getName()=" + getName() + ", getBirht()=" + getBirht()
				+ ", getIncomeratio()=" + getIncomeratio() + "]";
	}
	
	
	
	

}
