package view;

import utils.IoUtils;
import utils.NumberUtils;

public class Ex08Prime {

	public static void main(String[] args) {
		
		int number = IoUtils.inputNumber(0, 5, "Nhập vào số nguyên dương N: ");
		System.out.println(number + " là số nguyên tố ??? => " + NumberUtils.checkPrime(number));

	}

	
}
