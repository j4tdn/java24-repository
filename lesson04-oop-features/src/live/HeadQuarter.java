package live;

import java.time.LocalDate;

public class HeadQuarter extends Profile {
	public HeadQuarter() {
	}

	public HeadQuarter(String name, LocalDate birth, double salaryRanking, double titleRanking, String department) {
		super(name, birth, salaryRanking, titleRanking, department);
	}

	@Override
	public String toString() {
		return "HeadQuarter [" + super.toString() + "]";
	}

}
