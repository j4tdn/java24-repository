package exam;


public class Ex03 {
	public static void main(String[] args) {
		String input = "Welcome  to JAVA10  class";
		String[] inputs = input.split("[\s]+");
		System.out.println(revert(inputs));
	}
	
	// A có thể sửa nhanh lại bên dưới cho gọn code nha
	public static String revert(String[] str) {
		StringBuilder output = new StringBuilder();
		for (String s: str) {
			output.append(new StringBuilder(s).reverse()).append(" ");
		}
		return output.toString();
	}
}
