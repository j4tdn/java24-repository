package view;

import java.text.Normalizer;

public class Ex03VnmesetoE {

	public static void main(String[] args) {
		String s = "Em có yêu anh không để biết anh còn chờ";

		String s2 = Normalizer.normalize(s, Normalizer.Form.NFD);
		s2 = s2.replaceAll("[^\\p{ASCII}]", "");
		System.out.println(s2);

	}

}
