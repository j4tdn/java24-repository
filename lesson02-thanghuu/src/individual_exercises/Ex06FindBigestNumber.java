package individual_exercises;

import java.util.Scanner;

public class Ex06FindBigestNumber {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a,b,c;
		while (true) {
			try {
				System.out.println("Nhap a: ");
				a = Integer.parseInt(ip.nextLine());
			} catch (Exception e) {
				System.out.println("Loi, moi nhap lai!");
				continue;
			}
			break;
		}
		while (true) {
			try {
				System.out.println("Nhap b: ");
				b = Integer.parseInt(ip.nextLine());
			} catch (Exception e) {
				System.out.println("Loi, moi nhap lai!");
				continue;
			}
			break;
		}
		while (true) {
			try {
				System.out.println("Nhap c: ");
				c = Integer.parseInt(ip.nextLine());
			} catch (Exception e) {
				System.out.println("Loi, moi nhap lai!");
				continue;
			}
			break;
		}
		
		int max = a, min = a;
		if(b > a && b > c)
			max = b;
		if(c > a && c > b)
			max = c;
		if(b < a && b < c)
			min = b;
		if(c < a && c < b)
			min = c;
		
		System.out.println("So lon nhat la: "+max);
		System.out.println("So nho nhat la: "+min);
		ip.close();
	}
	
}
