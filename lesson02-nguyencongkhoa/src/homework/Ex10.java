package homework;

import java.util.Random;

public class Ex10 {
	private static Random rand = new Random();
//	public static void main(String[] args) {

//		int s1 = rand.nextInt(20, 31), s2, s3, s4, s5;
//		System.out.print("5 số ngẫu nhiên từ 20 đến 30 là: ");
//		System.out.print(s1 + " ");
//		while (true) {
//			s2 = rand.nextInt(20, 31);
//			if (s1 != s2) {
//				System.out.print(s2 + " ");
//				break;
//			}
//		}
//
//		while (true) {
//			s3 = rand.nextInt(20, 31);
//			if (s1 != s3 && s2 != s3) {
//				System.out.print(s3 + " ");
//				break;
//			}
//		}
//		
//		while (true) {
//			s4 = rand.nextInt(20, 31);
//			if (s1 != s4 && s2 != s4 && s3 != s4) {
//				System.out.print(s4 + " ");
//				break;
//			}
//		}
//		
//		while (true) {
//			s5 = rand.nextInt(20, 31);
//			if (s1 != s5 && s2 != s5 && s3 != s5 && s4 != s5) {
//				System.out.print(s5 + " ");
//				break;
//			}
//		}
//		
//	}

	public static void main(String[] args) {
		int cnt = 1;
		int[] uniqueRand = new int[5];
		uniqueRand[0] = rand.nextInt(20, 31);

		while (cnt < 5) {
			boolean checkDuplicated = false;
			int num = rand.nextInt(20, 31);

			for (int i = 0; i < cnt; i++) {
				if (uniqueRand[i] == num) {
					checkDuplicated = true;
					break;
				}
			}
			
			if (!checkDuplicated) {
				uniqueRand[cnt++] = num;
			}
		}
		
		System.out.println("5 số ngẫu nhiên từ 20 đến 30 là: ");
		for (int i = 0; i < cnt; i++) {
			System.out.print(uniqueRand[i] + " ");
		}

	}

}
