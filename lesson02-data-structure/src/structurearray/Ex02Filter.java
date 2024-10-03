package structurearray;

import java.util.Arrays;

/**
 * 1. Tim nhung phan tu le? trong mang so nguyen input: mang? output: mang? so
 * le
 */
public class Ex02Filter {

	public static void main(String[] args) {
		int[] numbers = { 12, 55, 43, 41, 56, 63 };
		int[] oddNumbers = findOddNumbers(numbers);
		// hàm này trả về kết quả là chuỗi lấy từ oddNumbers
		System.out.println("Array " + Arrays.toString(oddNumbers));
	}

	private static int[] findOddNumbers(int[] elements) {
		// index: 0 1 2 3 4
		// value: 0 0 0 0 0
		// tao 1 mang co do dai bang mang input
		int[] oddEle = new int[elements.length];
		int count = 0; // tao bien dem
		for (int element : elements) { // duyet tim phan tu mang
			if (element % 2 != 0) { // neu phan tu mang thoa dieu kien
				oddEle[count] = element; // gan gia tri cua phan tu thoa dkien cho mang moi
				count++; // thuc hien dem phan tu thoa dkien
			}
		}
		// Khi ta muốn cho ra mảng với kết quả là
		// danh sách các phần tử thỏa điều kiện
		int[] result = new int[count]; // tạo mảng mới từ count(số phần tử thỏa)
		for (int i = 0; i < count; i++) { // đếm từ 0 đến count mỗi lần như vậy sẽ gán phần tử thoải dk vào mảng mới
			result[i] = oddEle[i];
		}

		return result; // trả kq về mảng kết quả cuối cùng
	}

}
