package Ex03;

public class getMaxValidNumber {
	public static void main(String[] args) {
		String test1 = "12abu02muzk586cyx";
		String test2 = "Uyk892nn1234uxo2";
		System.out.println(getMaxValidNumber(test1));
		System.out.println(getMaxValidNumber(test2));
	}
	
	public static int getMaxValidNumber(String input) {
		int maxNumber = -1;
		String currentNumber = "";
		for(int i = 0; i <= input.length(); i++) {
			char ch = input.charAt(i);
			if(ch >= '0' && ch <= '9') {
				currentNumber += ch;
			}else {
				if(!currentNumber.isEmpty()){
					int number = Integer.parseInt(currentNumber);
					if(number > maxNumber) {
						maxNumber = number;
					}
					currentNumber = "";
				}
			}
		}
		if(!currentNumber.isEmpty()) {
			int number = Integer.parseInt(currentNumber);
			if(number > maxNumber) {
				maxNumber = number;
			}
		}
		return maxNumber;
	}
}
