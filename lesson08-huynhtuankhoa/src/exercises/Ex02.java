package exercises;

public class Ex02 {
	public static void main(String[] args) {
		String input = "Anne frAnk";
		StringBuilder output = new StringBuilder();
		boolean isCharBefore = false;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if (c == ' ' ) {
				isCharBefore = false;
				output.append(c);
				continue;
			}
			
			if (!isCharBefore) {
				output.append(Character.toUpperCase(c));
				isCharBefore = true;
			} else {
				output.append(Character.toLowerCase(c));
			}
			
			
		}
		System.out.println(output);
	}
}
