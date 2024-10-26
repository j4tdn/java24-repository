package live.demo;

import java.time.LocalDate;

public class Staff extends Person {

	private String leaderTeamName;

	public Staff() {
	}

	public Staff(String name, LocalDate birth, Double salaryCoefficient, String workUnit, String leaderTeamName) {
		super(name, birth, salaryCoefficient, workUnit);
		this.leaderTeamName = leaderTeamName;
	}

	public String getLeaderTeamName() {
		return leaderTeamName;
	}

	public void setLeaderTeamName(String leaderTeamName) {
		this.leaderTeamName = leaderTeamName;
	}

	@Override
	public Double salaryInDouble() {
		double totalMoney = this.getSalaryCoefficient() * 1250000;
		return totalMoney;
	}

	@Override
	public String toString() {
		return "Staff [leaderTeamName=" + leaderTeamName + ", getName()=" + getName() + ", getBirth()=" + getBirth()
				+ ", getSalaryCoefficient()=" + getSalaryCoefficient() + ", getPosition()=" + getPosition()
				+ ", getWorkUnit()=" + getWorkUnit() + "]";
	}

}
