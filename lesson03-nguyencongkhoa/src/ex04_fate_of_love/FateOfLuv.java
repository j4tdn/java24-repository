package ex04_fate_of_love;

import java.time.LocalDate;

import Utilities.Utils;

public class FateOfLuv {

	public static void main(String[] args) {
		Participant p1 = new Participant("Nguyen Van A", "Male", "Da Nang",
				new String[] { "Chơi Game", "Bong Da", "Ca Hat", "Bida", "Du LiCh" }, LocalDate.of(2000, 12, 10));
		Participant p2 = new Participant("Nguyen Thi B", "Female", "Quang Nam",
				new String[] { "Choi Game", "Bóng Da", "Cau Long", "DU Lich", "Ca Hat", "Nau An" },
				LocalDate.of(1999, 8, 13));
		Participant p3 = new Participant("Tran C", "Male", "Hue",
				new String[] { "Boi Loi", "Bong Da", "CẦu Long", "Nau An" }, LocalDate.of(1990, 6, 15));
		Participant p4 = new Participant("Le Mai D", "Male", "Ho Chi Minh",
				new String[] { "Bong Da", "Cau Long", "nẤu an", "Chơi cỜ", "NhaY MuA" }, LocalDate.of(1990, 6, 15));

		if (p1.checkConditions(p2)) {
			System.out.println("Full mame of participant p1" + p1.getFullName());
			System.out.println("Full mame of participant p2" + p2.getFullName());
			for (String s : p1.sameHobby(p2)) {
				System.out.println(s);
			}
		} else {
			System.out.println("Rất tiếc 2 bạn không hợp với nhau !");
		}
		
//		if (p1.checkConditions(p3)) {
//			System.out.println("Full mame of participant p1" + p1.getFullName());
//			System.out.println("Full mame of participant p2" + p3.getFullName());
//			for (String s : p1.sameHobby(p3)) {
//				System.out.println(s);
//			}
//		} else {
//			System.out.println("Rất tiếc 2 bạn không hợp với nhau !");
//		}
//		
//		if (p2.checkConditions(p4)) {
//			System.out.println("Full mame of participant p1" + p2.getFullName());
//			System.out.println("Full mame of participant p2" + p4.getFullName());
//			for (String s : p2.sameHobby(p4)) {
//				System.out.println(s);
//			}
//		} else {
//			System.out.println("Rất tiếc 2 bạn không hợp với nhau !");
//		}
	}

}
