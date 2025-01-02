package exercises;

import java.text.Normalizer;

public class Ex03 {
	public static void main(String[] args) {
		String input = "Em có yêu anh không anh để anh biết còn chờ\nEm xin lỗi em đã có thái độ không đúng với anh";
		String result = Normalizer.normalize(input, Normalizer.Form.NFD);
		System.out.println(result.replaceAll("[\\p{InCombiningDiacriticalMarks}]", ""));
		
	}
}
