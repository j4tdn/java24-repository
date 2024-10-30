package view;

import bean.Divisible;
import bean.Divisible57Others;
import bean.DivisibleBy5;
import bean.DivisibleBy7;

public class Ex02 {

	public static void main(String[] args) {

		int[] numbers = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };

		Divisible d5 = new DivisibleBy5(numbers);
		Divisible d7 = new DivisibleBy7(numbers);
		Divisible d57 = new Divisible57Others(numbers);

		Divisible finalD5 = new DivisibleBy5(d5.divisible());
		Divisible finalD7 = new DivisibleBy7(d7.divisible());
		Divisible finalD57 = new Divisible57Others(d57.divisible());

		finalD7.print();
		finalD57.print();
		finalD5.print();
	}

}
