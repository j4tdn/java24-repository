package ideaclass_exercises;

import static utils.NumberUtils.*;

public class Ex03Factotial {
	public static void main(String[] args) {
		
		int[] elements = {5, 8, 12, 3};
		
		for(int element : elements) {
			System.out.println(element + "! = " + fact(element));
		}
	}
	
}
