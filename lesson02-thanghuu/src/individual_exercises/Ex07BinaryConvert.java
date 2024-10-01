package individual_exercises;

import java.util.Scanner;

public class Ex07BinaryConvert {
	
	private static void convertToBinary(int number) {
	    if (number == 0) {
	        System.out.println("0\n");
	        return;
	    }

	    int[] binary = new int[32]; 
	    int index = 0;

	    while (number > 0) {
	        binary[index] = number % 2;
	        number /= 2;
	        index++;
	    }

	    System.out.println("Số nhị phân là: ");
	    for (int i = index - 1; i >= 0; i--) {
	         System.out.print(binary[i]);
	    }
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		while (true) {
			try {
				System.out.println("Nhap n: ");
				n = Integer.parseInt(ip.nextLine());
			} catch (Exception e) {
				System.out.println("Loi, moi nhap lai!");
				continue;
			}
			if(n < 0) {
				System.out.println("Loi, moi nhap lai!");
				continue;
			}
				
			break;
		}
		
		convertToBinary(n);
		
		ip.close();
	}
}
