package viewbt;

import utils.NumberUtils;

public class Ex09NthPrime {
	
	public static void main(String[] args) {
		
		int nthNumber = 200;
		
		int running = 2;
		int count = 0;
		
		while(true) {
			if (NumberUtils.isPrime(running)) {
				count++;
				if (count == nthNumber) {
					break;
				}
			}
			
			running++;
		}
		
		System.out.println("Số nguyên tố thứ " + nthNumber + " --> " + running);
		
	}
	
}