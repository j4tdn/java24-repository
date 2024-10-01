package individual_exercises;

public class Ex09FindPrime {
	
	private static boolean isPrime(int number) {
		if(number < 2)
			return false;
		for(int i = 2; i * i <= number; i++ ) {
			if(number % i == 0) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int count = 0;
	    int number = 1;
	    int targetPrime = 200;
	    int primeNumber = 0;

	    while (count < targetPrime) {
	        number++;
	        if (isPrime(number)) {
	            count++;
	            primeNumber = number; 
	        }
	    }

	  
	    System.out.print("Số nguyên tố thứ "+targetPrime+" là: "+ primeNumber);

		
	}
}
