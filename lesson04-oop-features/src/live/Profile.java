package live;

import java.time.LocalDate;

public class Profile {
	private String name;
	private LocalDate birth;
	private double salaryRanking;
	private double titleRanking;
	private String department;

	public Profile() {
	}

	public Profile(String name, LocalDate birth, double salaryRanking, double titleRanking, String department) {
		this.name = name;
		this.birth = birth;
		this.salaryRanking = salaryRanking;
		this.titleRanking = titleRanking;
		this.department = department;
	}

	public Profile(String name, LocalDate birth, double salaryRanking, double titleRanking) {
		this.name = name;
		this.birth = birth;
		this.salaryRanking = salaryRanking;
		this.titleRanking = titleRanking;
	}

	public Profile(String name, LocalDate birth, double salaryRanking, String department) {
		this.name = name;
		this.birth = birth;
		this.salaryRanking = salaryRanking;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", birth=" + birth + ", salaryRanking=" + salaryRanking + ", titleRanking="
				+ titleRanking + ", department=" + department + "]";
	}

}
