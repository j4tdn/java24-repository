package homework_01;

import java.util.Random;

public class Bai4 {
	
	
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[4];
		int sum=0;
		for(int i = 0; i < 4; i++) {
			numbers[i] = rd.nextInt(10, 21);
			System.out.println("So ngau nhien thu " + (i + 1) + " la:" + numbers[i]);
		
			
		}
		for (int i = 0; i < numbers.length; i++) {
		    int number = numbers[i];
		    sum += tinhGiaiThuaCuaChuSo(number);
		}
		System.out.println("Tong giai thua = " + sum);
	}
	
	
	
	public static long tinhGiaiThua(int n) {
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua = giaiThua *i  ;
        }
        return giaiThua;
    }
	
	public static long tinhGiaiThuaCuaChuSo(int number) {
        long sum = 0;
        while (number > 0) {
            sum =  sum + tinhGiaiThua(number % 10);
            number = number/10;
        }
        return sum;
    }
	
}
