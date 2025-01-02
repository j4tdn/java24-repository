package view;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		
		String name = "Em xin lỗi vì em đã chờ anh";
		System.out.println(removeAccent(name));
		
	}
		
		
		
	private static String removeAccent(String s) {

		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

		return pattern.matcher(temp).replaceAll("").replaceAll("đ", "d").replaceAll("Đ", "D");

	}

}
