package utils;

import bean.Students;

public class AveragePoint {

	public static Double aPoint(Students student) {
		return (student.getTheoryPoint() + student.getPracticePoint()) / 2;
	}

}
