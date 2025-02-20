package view;

import java.util.Arrays;

public class Ex03OperationAddRemove {

	public static void main(String[] args) {
		String[] words = { "a", "b", "c", "d", "e" };
		// length = 5
		// index: 0 -> 4

		// viết hàm thêm 1 ptu vào vị trí bất kì trong mảng
		try {
			System.out.println(Arrays.toString(add(words, 2, "w")));
			System.out.println(Arrays.toString(remove(words, 2)));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		// viết hàm xóa 1 ptu tại 1 vị trí bất kì trong mảng

	}

	private static String[] add(String[] source, int pos, String newValue) {
		if ( pos < 0 || pos >= source.length) {
			throw new IllegalArgumentException("Vị trí thêm vượt phạm vi");}
		String[] target = new String[source.length +1];
		
		// cách này chia 2 phía: 1 phía bên trái pos và bên phải pos
		// bên trái copy từ source
		// bên phải thì copy phần tử phía trước 
		// pos thì gán giá trị mới
		for (int i = 0; i < target.length; i++) {
			if ( i < pos) {
				target[i] = source [i];
			} else if (i == pos) {
				target[i] = newValue;
			} else {
				target[i] = source[i-1];
			}
		}
		
		
		
	/*	
	 
	
		// B1: tao mang moi gom n+1 phan tu
		String[] target = new String[source.length + 1];

		// B2: copy cac phan tu from souce sang target dung vi tri
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		// B3: nếu pos trùng vs phần tử nào thì từ ptử đấy dịch phải sang 1 đơn vị
******************************************************************************************
		// dịch phải: ==> duyệt từ phải sang trái, từ phần tử thứ length rồi trừ 1 
		for (int i = source.length ; i > pos; i--) {
			target[i] = target[i - 1];
		}
		// B4: gán ptử mới vào pos
		target[pos] = newValue;
		
	 */	
		return target;
	}

	private static String[] remove(String[] source, int pos) {
		if ( pos < 0 || pos >= source.length) {
			throw new IllegalArgumentException("Vị trí xóa vượt phạm vi");
		}
		//B1: copy
		String[] target = Arrays.copyOfRange(source, 0, source.length);
		
		//B2: dịch trái 1 đợt vị từ pos đến length
		for (int i = pos; i < source.length -1; i++) {
			target[i] = target[i+1];
		}
		return Arrays.copyOfRange(target, 0, target.length-1);
		}
	}

