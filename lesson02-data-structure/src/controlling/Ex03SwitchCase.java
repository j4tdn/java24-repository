package controlling;

import java.util.Random;

public class Ex03SwitchCase {
//	su dung switch case khi so sanh bang
//	ex: random 1->5, sau do in ra tu tieng anh ung voi so do
	
	
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(1, 6);
		
		switch (number) {
		case 1: {
			System.out.println("ONE");
			break;
		}
		case 2: {
			System.out.println("TWO");
			break;
		}
		case 3: {
			System.out.println("Three");
			break;
		}
		case 4: {
			System.out.println("FOUR");
			break;
		}
		case 5: {
			System.out.println("FIVE");
			break;
		}
		default:
			System.out.println("Unsupported...");
		}
		
	}
}
