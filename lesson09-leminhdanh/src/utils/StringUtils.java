package utils;

public class StringUtils {

	public static int biggestNumber(String str) {
		String[] array = str.split("[A-Za-z]");
		int result = 0;
		for (String s : array) {

			int n = 0;
			try {
				n = Integer.parseInt(s);
				System.out.println(n);
				if(n>result) {
					result = n;
				}
			} catch (NumberFormatException e) {
				e.getStackTrace();
			}

		}
		return result;
	}
	
	public static StringBuilder revert(String s) {
		StringBuilder result = new StringBuilder();
			result = result.append(s.strip().replaceAll("[\\s]+", " "));
		return result.reverse();
	}
}
