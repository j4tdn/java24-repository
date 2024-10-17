package utils;

import bean.Person;

public class LoveUtils {

	private LoveUtils() {
	}

	private static String[] sameHobby = new String[10];

	public static boolean checkGender(Person p1, Person p2) {
		if (p1.getGender() == p2.getGender()) {
			return false;
		}
		return true;
	}

	public static boolean checkAge(Person p1, Person p2) {
		int diffAge = p1.getBirthday().getYear() - p2.getBirthday().getYear();

		if (diffAge > 8 || diffAge < -8) {
			return false;
		}
		return true;
	}

	public static boolean checkHobby(Person p1, Person p2) {
		String[] hobby1 = p1.getInterest();
		String[] hobby2 = p2.getInterest();
		int count = 0;
		for (String hobbi1 : hobby1) {
			for (String hobbi2 : hobby2) {
				if (hobbi1 == hobbi2) {
					sameHobby[count] = hobbi1;
					count++;
				}
			}
		}
		if (count < 4) {
			return false;
		}

		return true;
	}

	public static void checkConditions(Person p1, Person p2) {
		if (checkAge(p1, p2) && checkGender(p1, p2) && checkHobby(p1, p2)) {

			System.out.printf("%-20s %-20s %10s %20s\n", "Tên", "Giới tính", "Địa chỉ", "Ngày sinh");
			System.out.println(
					"==================================================================================================");
			System.out.printf("%-20s %-20s %10s %20s\n", p1.getName(), p1.getGender(), p1.getAddress(), p1.getBirthday());
			System.out.printf("%-20s %-20s %10s %20s\n", p2.getName(), p2.getGender(), p2.getAddress(), p2.getBirthday());
			
			System.out.println(
					"==================================================================================================");
			
			System.out.printf("Sở thích chung là : ");
			for (String hobby : sameHobby) {
				if (hobby != null) {
					System.out.printf(hobby + ", ");
				}
			}
		} else {
			System.out.println("Rất tiếc 2 bạn không hợp nhau");
		}
	}

}
