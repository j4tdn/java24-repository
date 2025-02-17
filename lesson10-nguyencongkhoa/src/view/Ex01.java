package view;

import static utils.Utils.*;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int n = inputInt("Nhập số lượng phần tử trong mảng muốn tạo: ");
		int start = inputInt("Nhập giá trị bắt đầu để tạo ngẫu nhiên: ");
		int end = inputInt("Nhập giá trị kết thúc để tạo ngẫu nhiên: ");

		int[] arrayRandom = arrayRandom(n, start, end);
		System.out.println();
		for (int x : arrayRandom) {
			System.out.print(x + " ");
		}

		int[] arrNoDuplicates = arrNoDuplicates(arrayRandom);
		System.out.print("\n\nCác phần tử không trùng nhau trong mảng là: ");
		for (int x : arrNoDuplicates) {
			System.out.print(x + " ");
		}

		compareAvgValueHalfArr(arrayRandom);

		bubbleSort(arrayRandom, arrayRandom.length);
		System.out.print("\nMảng sau khi sắp xếp giảm dần là: ");
		for (int x : arrayRandom) {
			System.out.print(x + " ");
		}
		
		System.out.println("\nGiá trị lớn thứ 3 trong mảng là: " + find3rdHighestNumber(arrayRandom));

	}

	private static int[] arrNoDuplicates(int[] arr) {
		int[] arrNoDupl = new int[arr.length];
		int cnt = 0;
		for (int x : arr) {
			if (isDuplicated(x, arr)) {
				continue;
			} else {
				arrNoDupl[cnt++] = x;
			}
		}
		return Arrays.copyOfRange(arrNoDupl, 0, cnt);
	}

	private static boolean isDuplicated(int num, int[] arr) {
		int cnt = 0;
		for (int x : arr) {
			if (x == num) {
				cnt++;
			}
			if (cnt == 2) {
				return true;
			}
		}
		return false;
	}

	private static void compareAvgValueHalfArr(int[] arr) {
		double a = 0, b = 0;
		int half = arr.length / 2;
		for (int i = 0; i < half; i++) {
			a += i;
		}
		a /= half;
		for (int i = half; i < arr.length; i++) {
			b += i;
		}
		b /= half;
		if (a > b) {
			System.out.println("\n\nGiá trị trung bình n/2 phần tử đầu tiên lớn hơn n/2 phần tử cuối cùng");
		} else if (a < b) {
			System.out.println("\n\nGiá trị trung bình n/2 phần tử đầu tiên nhỏ hơn n/2 phần tử cuối cùng");
		} else {
			System.out.println("\n\nGiá trị trung bình n/2 phần tử đầu tiên bằng n/2 phần tử cuối cùng");
		}
	}

	private static void bubbleSort(int a[], int n) {
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	private static int find3rdHighestNumber(int[] a) {
		int cnt = 1, thirdMax = a[0];
		for (int i = 1; i < a.length; i++) {
			if (thirdMax > a[i]) {
				thirdMax = a[i];
				cnt++;
				if (cnt == 3) {
					break;
				}

			} else {
				continue;
			}
		}
		if (cnt < 3) {
			System.out.println("\nKhông có giá trị lớn thứ 3!!");
			System.exit(0);
		}
		
		return thirdMax;
	}

}
