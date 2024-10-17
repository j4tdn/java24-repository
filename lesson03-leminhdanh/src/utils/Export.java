package utils;

import java.util.Arrays;

import bean.Person;

public class Export {
	public static void export(Person person1, Person person2, String[] result) {
		if (result.length >= 3) {
			System.out.println("2 ban hop nhau\n");
			System.out.println(person1.toString());
			System.out.println(person2.toString());
			System.out.println("\nsở thích giống nhau là:" + Arrays.toString(result));

		} else {
			System.out.println("Rất tiếc 2 người không hợp nhau!");
		}
	}
}
