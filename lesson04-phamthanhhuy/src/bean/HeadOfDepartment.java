package bean;

import java.time.LocalDate;

public class HeadOfDepartment extends Personel {

	private Double postionRatio;
	private String deName;

	public HeadOfDepartment() {
		// TODO Auto-generated constructor stub
	}

	public HeadOfDepartment(String name, LocalDate birth, Double salaryRatio, Double postionRatio, String deName) {
		super(name, birth, salaryRatio);
		this.postionRatio = postionRatio;
		this.deName = deName;
	}

	public Double getPostionRatio() {
		return postionRatio;
	}

	public void setPostionRatio(Double postionRatio) {
		this.postionRatio = postionRatio;
	}

	public String getDeName() {
		return deName;
	}

	public void setDeName(String deName) {
		this.deName = deName;
	}

	@Override
	public String toString() {
		return "HeadOfDepartment [postionRatio=" + postionRatio + ", deName=" + deName + ", getName()=" + getName()
				+ ", getBirth()=" + getBirth() + ", getSalaryRatio()=" + getSalaryRatio() + "]";
	}

	@Override
	Double salary() {
		// TODO Auto-generated method stub
		return (getSalaryRatio() + getPostionRatio()) *2200000;
	}

}
