package view.test01;

import static java.lang.Math.*;

import java.util.Arrays;

public class Ex01MinFract {
	
	/*
	 ▪ 0.1 → 1/10
	 ▪ 0.2 → 1/5
	 ▪ 0.04 → 1/25
	 ▪ 0.75 → 3/4
	 ▪ 1.5 → 3/2
	 
	 Cách làm:
	 B1: Gán tử = chính nó
	     Gán mẫu = 1
	     
	 B2: Nhân cả tử và mẫu cho 10
	     Đến khi nào tử là số nguyên thì dừng lại
	     --> Phân số gồm tử và mẫu
	 
	 B3: Tìm phân số tối giản   
	 
	  
	 Cách 2:
	 0.75 = 75/100
	 num = ptp
	 den = 10^(ptpLength)
	 
	 0.1 = 1/10
	 
	 3.4 = 34/10 = 3*10^1 + 4
	     = 10^1
	     
	 num = intPart * 10^(decPartLength) + decPart
	 den = 10^(decPartLength)
	 
	 12.8
	 
	 num = 12 * 10^1 + 8
	 den = 10^1
	  
	 */
	
	public static void main(String[] args) {
		double[] decimals = {0.1234567834567345677373728372378456789d};
		
		// epoch time: 1.1.1970 mid night
		
		// A: ms --> Số ms từ A đến epoch time
		// B: ms --> Số ms từ A đến epoch time
		
		long startTime = System.currentTimeMillis();
		
		for(double decimal: decimals) {
			System.out.printf("%s có phân số là %s(v1)\n", decimal, getMinFractV1(decimal));
		}
		
		System.out.println("v1 duration:" + (System.currentTimeMillis() - startTime) + "(ms)");
	
		
		System.out.println("\n==========================\n");
		
		startTime = System.currentTimeMillis();
		
		for(double decimal: decimals) {
			System.out.printf("%s có phân số là %s(v2)\n", decimal, getMinFractV2(decimal));
		}
		
		System.out.println("v2 duration:" + (System.currentTimeMillis() - startTime) + "(ms)");
		
	}
	
	// 12.24 --> "12.24"
	
	private static String getMinFractV2(double number) {
		String[] parts = String.valueOf(number).split("\\.");
		
		long intPart = Long.parseLong(parts[0]);
		long decPart = Long.parseLong(parts[1]);
		long decPartLength = parts[1].length();
		
		double numerator = intPart * Math.pow(10, decPartLength) + decPart;
		double denominator = Math.pow(10, decPartLength);
		
		long numAsInt = (long)numerator;
		long denAsInt = (long)denominator;
		
		long gcd = gcd(numAsInt, denAsInt);
		
		return numAsInt/gcd + "/" + denAsInt/gcd;
	}
	
	
	private static String getMinFractV1(double number) {
		double numerator = number;
		double denominator = 1;
		
		while(!isInt(numerator)) {
			numerator *= 10;
			denominator *= 10;
		}
		
		long numAsInt = (long)numerator;
		long denAsInt = (long)denominator;
		
		long gcd = gcd(numAsInt, denAsInt);
		
		return numAsInt/gcd + "/" + denAsInt/gcd;
	}
	
	// Tìm ước chung lớn nhất
	private static long gcd(long n1, long n2) {
		long gcd = n1;
		while(n1 != n2) {
			gcd = n1 > n2 ? (n1 -= n2) : (n2 -= n1);
		}
		return gcd;
	}
	
	// Kiểm tra số có phải là số nguyên
	private static boolean isInt(double number) {
		return ceil(number) == floor(number);
	}
	
}
