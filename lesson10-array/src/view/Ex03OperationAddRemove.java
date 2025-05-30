package view;

import java.util.Arrays;

public class Ex03OperationAddRemove {
	
	public static void main(String[] args) {
		
		// length = 5
		// index: [0, 4]
		String[] words = {"a", "b", "c", "d", "e"};
		
		// Viết hàm thêm 1 phần tử vào vị trí bất kỳ trong mảng
		try {
			System.out.println("Thêm mới: " + Arrays.toString(add(words, 3, "w")));
		} catch (Exception e) {
			System.out.println("Thêm mới --> " + e.getMessage());
		}
		
		// Viết hàm xóa 1 phần tử tại vị trí bất kỳ trong mảng
		try {
			System.out.println("Xóa phần tử: " + Arrays.toString(remove(words, 2)));
		} catch (Exception e) {
			System.out.println("Xóa phần tử --> " + e.getMessage());
		}
	}
	
	private static String[] add(String[] source, int pos, String newValue) {
		if (pos < 0 || pos > source.length) {
			throw new IllegalArgumentException("Vị trí thêm vượt ngoài phạm vi của mảng");
		}
		
		// B1: Tạo mảng mới gồm n+1 phần tử
		String[] target = new String[source.length + 1];
		
		// B2: Copy qua đúng vị trí
		for (int i = 0; i < target.length; i++) {
			if (i < pos) {
				target[i] = source[i];
			} else if (i == pos) {
				target[i] = newValue;
			} else {
				target[i] = source[i-1];
			}
		}
		
		/*
		// B1: Tạo mảng mới gồm n+1 phần tử
		String[] target = new String[source.length + 1];
		
		// B2: Copy các phần tử từ source sang target đúng vị trí
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		// B3: Dịch phải 1 đơn vị từ length-1 về phần tử > pos
		for (int i = target.length-1; i > pos; i--) {
			target[i] = target[i-1];
		}
		
		// B4: Gán phần tử mới vào pos
		target[pos] = newValue;
		*/
		
		return target;
	}
	
	private static String[] remove(String[] source, int pos) {
		if (pos < 0 || pos >= source.length) {
			throw new IllegalArgumentException("Vị trí xóa vượt ngoài phạm vi của mảng");
		}
		
		// B1: Tạo mảng và copy giá trị từ source sang target
		String[] target = Arrays.copyOfRange(source, 0, source.length);
		
		// B2: Dịch trái 1 đợt vị từ pos đến length
		for (int i = pos; i < source.length-1; i++) {
			target[i] = target[i+1];
		}
		
		// B3: Trả về đúng số lượng phần tử cần
		return Arrays.copyOfRange(target, 0, target.length-1);
	}
}
