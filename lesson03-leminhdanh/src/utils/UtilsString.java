package utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

import bean.Person;

public class UtilsString {
	public static String covertToString(String value) {
		String temp = Normalizer.normalize(value, Normalizer.Form.NFD);

		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

		return pattern.matcher(temp).replaceAll("").toLowerCase();
	}

	public static String[] matching(Person person1, Person person2) {
		String[] mang = new String[person1.getHobby().length];

		int dem = 0;
		if (person1.getGender() == person2.getGender())
			return new String[] {};

		if (Math.abs(person1.getDateOfBirth().getYear() - person2.getDateOfBirth().getYear()) > 8)
			return new String[] {};

		for (int i = 0; i < person1.getHobby().length; i++) {
			for (int j = 0; j < person2.getHobby().length; j++) {
				if (covertToString(person1.getHobby()[i]).equals(covertToString(person2.getHobby()[j]))) {
					mang[dem] = covertToString(person1.getHobby()[i]);
					dem++;
				}
			}
		}
		String[] result = new String[dem];
		for (int i = 0; i < dem; i++) {
			result[i] = mang[i];
		}
		return result;
	}
}