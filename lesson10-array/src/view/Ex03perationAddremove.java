package view;

import java.util.Arrays;

public class Ex03perationAddremove {
	public static void main(String[] args) {
		
		// length = 5
		// index: [0, 4]
		String[] words = {"a","b","c","d","e"};
		
		// viết hàm thêm 1 phần tử bất kỳ trong mảng
		try {
			System.out.println("Thêm mới: " + Arrays.toString(add(words,4,"w")));
		} catch (Exception e) {
			System.out.println("Thêm Mới -->" + e.getMessage());
		}
		
		// viết hàm xoá 1 phần tử tại vị trí bất kỳ trong mảng
		try {
			System.out.println("Xoá phần tử : " + Arrays.toString(remove(words,2)));
		} catch (Exception e) {
			System.out.println("Xoá phần tử -->" + e.getMessage());
		}
		
	}
	private static String[] add(String[] source, int pos, String newValue) {
		if (pos < 0 || pos > source.length ) {
			throw new IllegalArgumentException("Vị trí thêm vược ngoài phạm vi của mảng");
		}
		//B1: tạo mảng mới gồm n+1 phần tử
		String[] target = new String[source.length+1];
		
		//B2: Copy các phần tử từ source sang target đúng vị trí
		for(int i=0;i< source.length;i++) {
			target[i] = source[i];
		}
		//B2.1 coppy đúng vị trí
//		for(int i = 0;i< target.length;i++) {
//			if(i<pos) {
//				target[i] = source[i];
//			}else if(i == pos) {
//				target[i] = newValue;
//			}else {
//				target[i] = source[i-1];
//			}
//		}
		
		//B3: Dịch phải 1 đơn vị từ length về phần tử > pos
		for(int i = target.length-1;i>pos;i--) {
			target[i] = target[i-1];
		}
		
		//B4: Gán phần tử mới vào pos
		target[pos] = newValue;
		
		return target;
		
		
	}
	private static String[] remove(String[] source,int pos) {
		if (pos < 0 || pos >= source.length ) {
			throw new IllegalArgumentException("Vị trí xoá vược ngoài phạm vi của mảng");
		}
		//B1: Tạo mảng và coppy giá trị từ source sang target
		String[] target = Arrays.copyOfRange(source, 0, source.length);
		
		//B2: Dịch trái 1 đợt vị từ pos đên length
		for(int i=pos;i<source.length-1;i++) {
			target[i] = target[i+1];
		}
		//B3: Trả về đúng số lượng phần tử cần
		return Arrays.copyOfRange(target, 0, target.length-1); 
		
	}

}
