package bean;

import java.time.LocalDate;

public class Staff extends Personel {

	private Double positionRatio;
	private String deName;
	private HeadOfDepartment head;

	public Staff() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Staff(String name, LocalDate birth, Double salaryRatio, String deName, HeadOfDepartment head) {
		super(name, birth, salaryRatio);
		this.positionRatio = 0d;
		this.deName = deName;
		this.head = head;
	}

	public Double getPositionRatio() {
		return positionRatio;
	}

	public void setPositionRatio(Double positionRatio) {
		this.positionRatio = positionRatio;
	}

	public String getDeName() {
		return deName;
	}

	public void setDeName(String deName) {
		this.deName = deName;
	}

	public HeadOfDepartment getHead() {
		return head;
	}

	public void setHead(HeadOfDepartment head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "Staff [deName=" + deName + ", head=" + head.getName() + ", getName()=" + getName() + ", getBirth()="
				+ getBirth() + ", getSalaryRatio()=" + getSalaryRatio() + "]";
	}

	@Override
	Double salary() {
		return (getSalaryRatio() + getPositionRatio()) * 1250000;
	}

}
