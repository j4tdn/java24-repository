package ideaclass_exercises;

public class Ex07Converter {
	public static void main(String[] args) {
		int decimal = 11;
		System.out.println("Ma nhi phan cua "+ decimal + "la : "+convert(decimal));
	}
	
	private static String convert (int decimal) {
		String binaryAsString = "";
		while(decimal != 0) {
			int modPart = decimal % 2;
			binaryAsString = modPart + binaryAsString;
			decimal = decimal / 2;
		}
		return binaryAsString;
	}
}
