package exercise;

public class Ex02Array {
	
	public static void main(String[] args) {
		
		
		int[] n = {12,21,25,19,32,35,49,10,33,14,18};
		
		String left7 = "";
		String right5 = "";
		String center57 = "";

		for (int number : n) {
			if(number % 7 == 0 && number % 5 != 0) {
				left7 += number + " ";
			}
		}
		for(int number : n) {
			if(number % 7 != 0 && number % 5 == 0) {
				right5 += number + " ";
			}
		}
		for (int number : n) {
			if(number % 7 == 0 && number % 5 == 0) {
				center57 =+ number + " ";
			}
			
		}
		 System.out.println(left7 +"|" + center57 + "|" + right5);
	}	
	

}
