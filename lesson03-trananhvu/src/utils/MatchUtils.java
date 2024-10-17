package utils;

import bean.Person;

public class MatchUtils {
	private static String[] hb = new String[20];
	private static Integer count = 0;

	private MatchUtils() {
		// TODO Auto-generated constructor stub
	}

	private static int matchHobby(Person p1, Person p2) {

		for (String h1 : p1.getHobby()) {
			for (String h2 : p2.getHobby()) {
				if (StringUtils.removeAccent(h1).equals(StringUtils.removeAccent(h2))) {
					hb[count++] = h2;
				}

			}
		}
		return count;
	}

	private static boolean Match(Person p1, Person p2) {
		if (p1.getGender() == p2.getGender())
			return false;
		if (Math.abs(p1.getDateTime().getYear() - p2.getDateTime().getYear()) < 8)
			return false;
		if (matchHobby(p1, p2) < 4)
			return false;
		return true;
	}

	public static void export(Person[] persons) {
		if (Match(persons[0], persons[1])) {
			System.out.printf("%-20s %-20s %20s %20s\n", "Tên", "Giới Tính", "Địa chỉ", "Ngày sinh");
			System.out.println(
					"==========================================================================================");
			for (Person p : persons) {
				System.out.printf("%-20s %-20s %20s %20s\n", p.getName(), p.getGender(), p.getAddress(),
						p.getDateTime());

			}
			System.out.println(
					"==========================================================================================");
			System.out.print("Sở thích chung: ");
			for (String h : hb) {
				if (h != null)
					System.out.print(h + ", ");
			}
		} else
			System.out.println("Rất tiếc 2 bạn không hợp với nhau !");
	}
}
