package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bean.Word;

public class Ex05Dictionary {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Map<String, Word> dictionary = new HashMap<>();
		
		while (true) {
			System.out.println("------------------------");
			System.out.println("Chon yeu cau:  ");
			System.out.println("0. Thoat chuong trinh");
			System.out.println("1. Them moi tu vung");
			System.out.println("2. Tra tu dien");
			System.out.println("Chon:   ");
			
			switch (sc.nextLine()) {
			case "0":
				System.out.println("Thoat ct! ");
				return;
			case "1":
				addWord(dictionary);
				break;
			case "2":
				getWord(dictionary);
				break;
			default:
				System.out.println("Moi nhap lai: ");
				break;
			}
		}
	}
	
	private static void addWord(Map<String, Word> dictionary) {
		System.out.println("Nhap tu: ");
		String word = sc.nextLine();
		System.out.println("Nhap nghia: ");
		String mean = sc.nextLine();
		System.out.println("Nhap kieu tu");
		String type = sc.nextLine();
		System.out.println("Nhap ghi chu: ");
		String note = sc.nextLine();
		
		Word newWord = new Word(word, mean, type, note);
		dictionary.put(newWord.getWord(), newWord);
		
		System.out.println("Them thanh cong.");
	} 
	
	private static void getWord(Map<String, Word> dictionary) {
		System.out.println("Nhap tu muon tra: ");
		String word = sc.nextLine();
		if(dictionary.containsKey(word)) {
			System.out.println("-->   "+dictionary.get(word));
		}else {
			System.out.println("Khong tim thay tu nay.");
		}
	}

}
