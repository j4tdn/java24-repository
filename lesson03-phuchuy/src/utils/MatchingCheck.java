package utils;

import bean.Person;

public class MatchingCheck {

	public static void Check(Person p1, Person p2) {

		if (p1.getGender() != p2.getGender()) {
			if (Math.abs(p1.getBirth().getYear() - p2.getBirth().getYear()) < 8) {
				if (StringUtils.commonHobby(p1.getHooby(), p2.getHooby()) >= 4) {
					Export.exportMatching(p1, p2);
				} else {
					System.out.println("Rất tiếc 2 bạn ko hợp nhau!");
				}
			} else {
				System.out.println("Rất tiếc 2 bạn ko hợp nhau!");
			}

		} else
			System.out.println("Rất tiếc 2 bạn ko hợp nhau!");
	}

}
