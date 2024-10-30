package utils;

import bean.Students;

public class HigherThan {

	public static void h85(Students s1, Students s2, Students s3) {

		Students[] svs = { s1, s2, s3 };

		for (Students sv : svs) {
			if (AveragePoint.aPoint(sv) > 8.5) {
				System.out.println("Sinh viên có điểm tb trên 8.5: " + sv.getName());
			}
		}

	}
	public static void HP(Students s1,Students s2, Students s3) {
		
		Students[] svs = { s1, s2, s3 };

		for (Students sv : svs) {
			if (sv.getTheoryPoint() > sv.getPracticePoint()) {
				System.out.println("Sinh viên có điểm lt cao hơn tt: " + sv.getName());
			}
		}
	}

}

	

