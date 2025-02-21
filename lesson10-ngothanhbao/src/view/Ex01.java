package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = rd.nextInt(10, 50);
		}
		
		System.out.println("Mang: " + Arrays.toString(nums));
		
		System.out.println("Mang khong trung: " + Arrays.toString(getArrWithoutDup(nums)));
		
			
		System.out.println("Phan tu lon thu 3: " + getThirdLagest(nums));
		
		compareHalfArr(nums);
		
		sc.close();
	}

	public static boolean isDup(int[] source, int num) {
		int count = 0;
		for (int i = 0; i < source.length; i++) {
			if (source[i] == num) {
				count++;
			}
			if (count == 2) {
				return true;
			}
		}
		return false;
	}
	
	public static int[] getArrWithoutDup(int[] source) {
		int[] target = new int[source.length];
		int count = 0;
		for(int i = 0;i < source.length;i++) {
			if(!isDup(source, source[i])) {
				target[count++] = source[i];
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	public static void compareHalfArr(int[] source) {
		double halfFirst = 0,halfSecond = 0;
		int half = source.length / 2;
		
		if(source.length % 2 != 0) {
			System.out.println("Khong hop le");
			return;
		}
		
		for(int i = 0;i < half;i++) {
			halfFirst += source[i];
		}
		
		for(int i = half; i < source.length;i++) {
			halfSecond += source[i];
		}
		
		if(avg(halfFirst,half) > avg(halfSecond,half)) {
			System.out.println("Nua phan tu dau lon hon nua phan tu sau");
		} else if (avg(halfFirst,half) == avg(halfSecond,half)) {
			System.out.println("Nua phan tu dau bang nua phan tu sau");
		} else {
			System.out.println("Nua phan tu dau be hon nua phan tu sau");
		}		
	}
	
	public static int getThirdLagest(int[] sources) {
		int[] uniqueArr = getArrWithoutDup(sources);
		sort(uniqueArr);
		return uniqueArr[uniqueArr.length - 3];
	}
	
	public static double avg(double target,int count) {
		return target / count;
	}
	
	public static void sort(int[] elements) {
		for(int i =0;i < elements.length - 1;i++) {
			for(int j = 0;j < elements.length - i - 1;j++) {
				if(elements[j] > elements[j + 1]) {
					int temp = elements[j];
					elements[j] = elements[j + 1 ];
					elements[j + 1] = temp;
				}
			}
		}
	}
	
}
