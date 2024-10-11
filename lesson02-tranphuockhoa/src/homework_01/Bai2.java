package homework_01;

import java.util.Scanner;
import static java.lang.Math.*;

public class Bai2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int N = 0;
		int Max_Input = 5;
		boolean validInput = false;
		
		for(int i = 0; i < Max_Input; i++) {
			System.out.print("Nhap so nguyen N = ");
			String input = sc.nextLine();
			
			N = kiemTraSoNguyenDuong(input);
			if(N != -1) {// cho truong hop hop le
				validInput = true;
				break;
			} else {// cho truong hop ko hop le
				System.out.println("Chi duoc nhap so nguyen!!");
				if(i < Max_Input -1) {
					System.out.println("Vui long nhap lai.");
				}
			}
		}
		if (validInput) {
			if (kiemTraLuyThuaCua2(N)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		
		}
		sc.close();
		
	}
	public static int kiemTraSoNguyenDuong(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number > 0) {
                return number;
            } else {
                return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
    }
	 public static boolean kiemTraLuyThuaCua2(int number) {
	        if (number <= 0) {
	            return false;
	        }
	        return (number & (number - 1)) == 0;
	    }
	 
/*
 * 	private static boolean kiemTraLuyThuaCua2(
 */
}
