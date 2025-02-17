package view;

public class Ex04 {

	public static void main(String[] args) {
		String[] strings = { "-2", "10", "-26", null, "89", 
				"ab", null, "@$@", "a", "c", "bsdg", "!@" };
		forString("Mảng trước khi sắp xếp:", strings);
		
		bubbleSort(strings, strings.length);
		
		forString("Mảng sau khi sắp xếp:", strings);
		
		//System.out.println(isSpecial("12@4"));
	}
	
	private static void forString(String mess, String[] strings) {
		System.out.println(mess);
		for (String s : strings) {
			System.out.print( "\""+ s + "\"" + " ");
		}
		System.out.println();
	}
	
	private static void bubbleSort(String a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (compareTo(a[j], a[j+1]) > 0) {
					String tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
	}
	
	private static int compareTo(String a, String b) {
		if (a == null && b == null) {
			return 0;
		}
		if (a == null) {
			return -1;
		}
		if (b == null) {
			return 1;
		}
		// compare số & chữ
		if (isNumber(a) && !isNumber(b)) {
			return -1;
		}
		if (!isNumber(a) && isNumber(b)) {
			return 1;
		}
		// compare số
		if (isNumber(a) && isNumber(b)) {
			if (Integer.parseInt(a) > Integer.parseInt(b)) {
				return 1;
			} else if (Integer.parseInt(a) < Integer.parseInt(b)){
				return -1;
			} else {
				return 0;
			}
		}
		// compare special với no special
		if (!isSpecial(a) && isSpecial(b)) {
			return -1;
		}
		if (isSpecial(a) && !isSpecial(b)) {
			return 1;
		}
		// case còn lại string vs string
		return a.compareTo(b);
	}
	
	private static boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	private static boolean isSpecial(String s) {
		//.  Khớp với bất kỳ ký tự nào ngoại trừ ký tự xuống dòng
		//*  Khớp với 0 hoặc nhiều lần của ký tự hoặc nhóm trước đó
		return s.matches(".*[^a-zA-Z0-9].*");
	}

}
