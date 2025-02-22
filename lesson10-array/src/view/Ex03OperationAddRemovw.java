package view;

import java.util.Arrays;

public class Ex03OperationAddRemovw {
	public static void main(String[] args) {
		String[] words = { "a", "b", "c", "d", "e" };

		// Viết hàm thêm 1 phần tử vào vị trí bất kỳ trong mảng
		System.out.println(Arrays.toString(words));
		try {
			System.out.println(Arrays.toString(add(words, 12, "ĐC")));
		} catch( IllegalArgumentException e) {
			System.out.println(e);
		}
	

		// Viết hàm xóa 1 phần tử tại vị trí bất kỳ trong mảng
		try {
			System.out.println(Arrays.toString(remove(words, 2)));
		} catch( IllegalArgumentException e) {
			System.out.println(e);
		}
	}

	private static String[] add(String[] source, int pos, String newValue) {

//		 Code tự viết  đúng
//		String[] newArr = new String[source.length + 1];
//		for(int i = 0; i < newArr.length; i ++) {
//			if(i == pos) {
//				newArr[i] = newValue;
//			}
//			if(i < pos){
//				newArr[i] = source[i];
//			}
//			if(i > pos ) {
//				newArr[i] = source[i - 1];
//			}
//		}
//		return newArr;

		if (pos < 0 || pos > source.length) {
			throw new IllegalArgumentException("Vị trí thêm vượt ngoài phạm vi của mảng");
		}

		// B1: tao mang moi gom n+1 phan tu
		// B1: tao mang moi gom n+1 phan tu
		String[] target = new String[source.length + 1];

		// B2: copy cac phan tu from souce sang target dung vi tri
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		// B3: nếu pos trùng vs phần tử nào thì từ ptử đấy dịch phải sang 1 đơn vị
		for (int i = source.length; i > pos; i--) {
			target[i] = target[i - 1];
		}
		// B4: gán ptử mới vào pos
		target[pos] = newValue;
		return target;

	}

	private static String[] remove(String[] source, int pos) {
		if (pos < 0 || pos > source.length) {
			throw new IllegalArgumentException("Vị trí xóa vượt ngoài phạm vi của mảng");
		}
		// B1: Tạo mảng và copy giá trị từ source sang
		String[] target = Arrays.copyOfRange(source, 0, source.length);
		// B2: Dịch trái 1 đơn vị từ pos đến length
		for (int i = pos; i < source.length - 1; i++) {
			target[i] = target[i + 1];
		}

		// B3: Trả về đúng số lượng phần tửu cần thiết
		return Arrays.copyOfRange(target, 0, target.length - 1);
	}

}
