package exerciese;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		int i =0;
		int[] array = new int[5];
		for(; i  < 5 ; i++) {
			int number = new  Random().nextInt(20, 30);
			
			System.out.println(number);
		}
		
	}
}


