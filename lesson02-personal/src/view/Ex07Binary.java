package view;

import Utils.IoUtils;

public class Ex07Binary {
	
	public static void main(String[] args) {
		
		int N = 20;
		System.out.println(N + " có số ở hệ nhị phân là " + getBinary(N));
		
	}
	
	public static String getBinary(int number) {
		String binary = "";
		int modPart = 0;
		while(number != 0) {
			modPart = number % 2;
			binary = modPart + binary;
			number /= 2;
		}
		return binary;
	}

}
