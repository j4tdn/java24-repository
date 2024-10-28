package live;

import java.time.LocalDate;

public class Director extends Profile {
	public Director() {
	}

	public Director(String name, LocalDate birth, double salaryRanking, double titleRanking) {
		super(name, birth, salaryRanking, titleRanking);
	}

	@Override
	public String toString() {
		return "Director [" + super.toString() + "]";
	}

}
