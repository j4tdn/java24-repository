package exercise;

public class Ex09 {
	public static void main(String[] args) {
		
		    int count = 0; 
	        int number = 1; 
	        int target = 200; 
	        while (count < target) {
	            number++;
	            if (isPrime(number)) {
	                count++; 
	            }
	        }
	        System.out.println("So nguyen thu " + target + " la: " + number);
	}
	public static boolean isPrime(int n) {
        if (n <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; 
        }
        return true; 
    }
	
}

