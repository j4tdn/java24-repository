package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	/*
	 cach 2: su dung try catch de bat loi
	 + voi doan code bi exception
	 
	 + Khi khong xu ly --> dung chuong trinh
	 
	 + Xu ly loi voi try/ctach
	 	Dat doan code co kha nang bi exception trong khoi try 
	 	Dat doan code xu ly trong khoi catch
	 	Luu y: chi xu ly duoc khi bat dung exception
	 */
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("nhap nam sinh: ");
		
		int yob;
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.print("Nam sinh chua hop le, nhap lai: ");
			}
		} while (true);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("So tuoi = " + age);

		ip.close();
	}
	
}
