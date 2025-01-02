package exercises;

public class Ex04 {
	public static void main(String[] args) {
		int a = 15;
		int b = 75;
		System.out.println(findDivisors(a));
		System.out.println(findDivisors(b));
        System.out.println(findDivisors(a).toString().equals(findDivisors(b).toString()));
		
	}
	
	public static StringBuilder findDivisors(int num) {
		StringBuilder divisors = new StringBuilder();
		for (int i = 2; i <= Math.sqrt(60); i++) {
			if (num % i == 0 ) {
				while (num % i == 0) {
					num /= i;
				};	
				divisors.append(i);
			}
		}
		return divisors;
	}
}
