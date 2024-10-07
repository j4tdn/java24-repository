package view;

public class Ex07Converter {
	
	public static void main(String[] args) {
		
		int decimal = 5;
		
		System.out.println("Mã nhị phân của " + decimal + " = " + convert(decimal));
	}
	
	private static String convert(int decimal) {
		String binaryAsString = "";
		while(decimal != 0) {
			int modPart = decimal % 2;
			binaryAsString = modPart + binaryAsString;
			decimal = decimal / 2;
		}
		return binaryAsString;
	}
	
}
