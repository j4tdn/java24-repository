package view;

public class Ex01 {
    public static void main(String[] args) {
    	
        System.out.println(isPowerOf(8, 2)); 
    }
    public static boolean isPowerOf(int a, int b) {
        if (a == 1) {
        	return true; 
        }
        if (b <= 1) {
        	return a == 1; 
        }

        while (a % b == 0) {
            a /= b;
        }
        
        return a == 1;
    }
}

