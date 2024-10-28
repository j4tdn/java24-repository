package exercise;

import java.time.LocalDate;
import java.util.Scanner;

import bean.Human;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Human[] humans = new Human[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("Person " + (i+1) + ": ");
			humans[i] = createNewHuman();
		}
		if (checkCompatibility(humans[0], humans[1])) {
			displayInfor(humans);
		} else {
			System.out.println("I regret to inform you that you two are not compatible");
		}
		
	}
	private static Human createNewHuman() {
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter gender: ");
		String gender = sc.nextLine();
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		String[] hobbies = enterHobby();
		System.out.println("Enter date of birth: (yyyy-mm-dd)");
		String dayOfBirth = sc.nextLine();
		LocalDate dob = LocalDate.parse(dayOfBirth); 
		return new Human(name, gender, address, hobbies, dob);
	}
	private static String[] enterHobby() {
		System.out.println("How many hobbies do you have ?");
		int numOfHob = Integer.parseInt(sc.nextLine());
		String[] arrHob = new String[numOfHob];
		for (int i = 0; i < numOfHob; i++) {
			System.out.print("Enter hobby " + (i+1) + " : ");
			arrHob[i] = sc.nextLine();
		}
		return arrHob;
	}
	private static boolean checkCompatibility(Human person1, Human person2) {
		if (checkGenderIncompa(person1, person2) || checkAgeIncompa(person1, person2) || 
				checkHobbiesIncompa(person1, person2)) {
			return false;
		}
		return true;
			
	}
	private static boolean checkGenderIncompa(Human person1, Human person2) {
		if (person1.getGender().equals(person2.getGender())) {
			return true;
		}
		return false;
	}
	private static boolean checkAgeIncompa(Human person1, Human person2) {
		int year1 = person1.getDob().getYear();
		int year2 = person2.getDob().getYear();
		if (Math.abs(year1 - year2) > 8) {
			return true;
		}
		return false;
	}
	private static boolean checkHobbiesIncompa(Human person1, Human person2) {
		int count = 0;
		for (String h1: person1.getHobby()) {
			for (String h2: person2.getHobby()) {
				if (h1.equals(h2)) {
					count++;
				}
			}
		}
		if (count < 4) {
			return true;
		} 
		return false;
	}
	private static void displayInfor(Human[] humans) {
		for (Human human: humans) {
			System.out.println(human);
			System.out.println(human.getName() + "'s hobbies: ");
			for (String hob: human.getHobby()) {
				System.out.println(hob);
			}
		}
	}
}
