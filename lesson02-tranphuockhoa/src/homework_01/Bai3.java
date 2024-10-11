package homework_01;

import java.util.Scanner;

public class Bai3 {
	
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
				System.out.println(tinhGiaiThua(N));
		} else {
				System.out.println(tinhGiaiThua(N));
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
	public static long tinhGiaiThua(int n) {
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua = giaiThua *i  ;
        }
        return giaiThua;
       /*
        private static long fact(int n){
        	long f = n;
        	while(n>1){
        	...
        	}
        */
    }
}
