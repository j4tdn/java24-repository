package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {
	
/*
 
 Cách 1: Sử dụng validation
 ---> dảm bảo đoạn code bị exception sẽ không bao giờ xảy ra
 
 */
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhap nam sinh: ");
		
		String text = "";
		do {
			text = ip.nextLine();
			if(text.matches("\\d+")) {
				break;
			}
			
			System.out.println("Nam sinh chua hop le !!!, nhap lai:");
		}while(true);
		int yob = Integer.parseInt(text);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("--> So tuoi: " + age);
		ip.close();
	}
	
}
