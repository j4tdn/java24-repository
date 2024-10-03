package exercises;

public class Ex09 {

	public static void main(String[] args) {
        int count = 0;
        int n = 2;
        
        while (count < 200) {
        	if (Ex08.isPrime(n)) {
        		count++;
        	}
        	n++;
        }
        
        System.out.println("Số nguyên tố thứ 200 là: " + (n - 1));
	}
}