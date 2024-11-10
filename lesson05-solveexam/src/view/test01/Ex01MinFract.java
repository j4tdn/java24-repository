package view.test01;

import static java.lang.Math.*;

public class Ex01MinFract {
	public static void main(String[] args) {
		double[] decimals = {0.1d, 0.2d, 0.04d, 0.75d};
		
		for(double decimal: decimals) {
			System.out.printf("%s co phan so la %s\n",decimal, getMinFract(decimal));
		}
	}
	
	private static String getMinFract(double number) {
		double numerator = number;
		double denominator = 1;
		
		while (!isInt(numerator)) {
			numerator *= 10;
			denominator *= 10;
		}
		
		long numAsInt = (long)numerator;
		long denAsInt = (long)denominator;
		
		long gcd = gcd(numAsInt, denAsInt);
		
		return (long)numAsInt/gcd + "/" + denAsInt/gcd;
	}
	
	//UCLN
	private static long gcd(long n1, long n2) {
		long gcd = n1;
		while(n1 != n2) {
			gcd = n1 > n2 ? (n1 -= n2) : (n2 -= n1);
		}
		return gcd;
	} 
	
	private static boolean isInt(double number) {
		return ceil(number) == floor(number);
	}
}
