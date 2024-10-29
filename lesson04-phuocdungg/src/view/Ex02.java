package view;

import java.lang.reflect.Array;
import java.util.Arrays;

import bean.Divisible;
import bean.Divisible57Others;
import bean.DivisibleBy5;
import bean.DivisibleBy7;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int[] numbers = {12,21,25,19,32,35,49,10,33,14,18};
		
		Divisible d5 = new DivisibleBy5(numbers);
		Divisible d7 = new DivisibleBy7(numbers);
		Divisible d57 = new Divisible57Others(numbers);
		
		d5.divisible();
		d7.divisible();
		d57.divisible();
		
		System.out.println(Arrays.toString(d7.divisible()) + "|" + Arrays.toString(d57.divisible()) + "|" + Arrays.toString(d5.divisible()) );
	}

}
