package utils;

import java.io.IOError;
import java.io.IOException;

public class ValidEmailFormat {
	
	public static boolean validPrefix(String pre) throws IOException {

		for (int i = 0; i < pre.length(); i++) {
			char ch = pre.charAt(i);

			if (!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '_' && ch != '-' && ch != '.') {
				throw new IOException("Tiền tố không hợp lệ");
			} else if (!Character.isLetterOrDigit(pre.charAt(0))
					|| !Character.isLetterOrDigit(pre.charAt(pre.length() - 1))) {

				throw new IOException("Ký tự đặc biệt không hợp lệ 1");
			} else if (!Character.isLetterOrDigit(ch) && (!Character.isLetterOrDigit(pre.charAt(i - 1))
					|| !Character.isLetterOrDigit(pre.charAt(i + 1)))) {
				throw new IOException("Ký tự đặc biệt không hợp lệ 2");
			}
		}
		return true;
	}

}
