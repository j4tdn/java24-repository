package view;

import utils.BindingInputUtils;
import utils.PrimeNumberUtils;

public class Ex08 {
	public static void main(String[] args) {
		Integer n = BindingInputUtils.bindingInput();
		if (n != null)
			System.out.println(PrimeNumberUtils.isPrime(n));
		else
			System.out.println("Vui long thu lai sau!!");
	}
}
