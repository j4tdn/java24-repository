package view;

import utils.BindingInputUtils;
import utils.FactorialUtils;

public class Ex03 {
	public static void main(String[] args) {
		Integer n = BindingInputUtils.bindingInput();
		if (n != null)
			System.out.println(n + "! = " + FactorialUtils.factorial(n));
		else
			System.out.println("Vui long thu lai sau!!");
	}
}
