package exercises;

public class Ex01 {
	public static void main(String[] args) {
		String input = "tuấn khoa";
		
		// In ra mỗi kí tự trên một dòng
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			System.out.print(c + " ");
		}	
		// In ra mỗi từ trên mỗi dòng
		System.out.println("\n------------------");
		String[] words = input.split("\s");
		for (String str: words) {
			System.out.println(str);
		}
		// In ra chuỗi đảo ngược theo kí tự
		System.out.println("\n------------------");
		for (int i = input.length() - 1; i >= 0; i--) {
			char c = input.charAt(i);
			System.out.print(c + " ");
		}
		// In ra chuỗi đảo ngược theo từ
		System.out.println("\n------------------");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i] + " ");
		}
		
	}
}
