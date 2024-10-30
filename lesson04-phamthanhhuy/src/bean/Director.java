package bean;

import java.time.LocalDate;

public class Director extends Personel {
	
	private Double positionRatio;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}
	public Director(String name, LocalDate birth, Double salaryRatio) {
		super(name, birth, salaryRatio);
		this.positionRatio = 0d;
	}

	public Director(String name, LocalDate birth, Double salaryRatio, Double positionRatio) {
		super(name, birth, salaryRatio);
		this.positionRatio = positionRatio;
	}

	public Double getPositionRatio() {
		return positionRatio;
	}

	public void setPositionRatio(Double positionRatio) {
		this.positionRatio = positionRatio;
	}

	@Override
	public String toString() {
		return "Director [getName()=" + getName() + ", getBirth()=" + getBirth()
				+ ", getSalaryRatio()=" + getSalaryRatio() + ", positionRatio=" + positionRatio+ "]";
	}

	@Override
	Double salary() {
		return (getSalaryRatio()+getPositionRatio())*3000000 ;
	}


	

}
