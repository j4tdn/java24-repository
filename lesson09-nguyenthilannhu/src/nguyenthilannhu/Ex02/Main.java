package nguyenthilannhu.Ex02;

public class Main {
	
 public static int getLargestNumberFromString(String s) {
	      if ( s == null || s.isEmpty()) {
	            return 0;
	        }
      int maxNumber = 0;

	        String currentNumber = "";
	        
	        // Logic tốt nhưng a từng chỉ cách dùng hàm split có thể làm đơn giản hơn em hi
	       for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            if (Character.isDigit(c)) {
	                currentNumber += c;
	            } else {
	                if (!currentNumber.isEmpty()) {
	                    maxNumber = Math.max(maxNumber, Integer.parseInt(currentNumber));
	                    currentNumber = ""; 
	                }
	            }
	        }

	        
	        if (!currentNumber.isEmpty()) {
	            maxNumber = Math.max(maxNumber, Integer.parseInt(currentNumber));
	        }

	        return maxNumber;
	    }

	   
	    public static String[] getLargestNumbers(String... ss) {
	        int[] largestNumbers = new int[ss.length];

	        // xử lý
	        for (int i = 0; i < ss.length; i++) {
	            largestNumbers[i] = getLargestNumberFromString(ss[i]);
	        }

	      
	        // sắp xếp
	        for (int i = 0; i < largestNumbers.length - 1; i++) {
	            for (int j = i + 1; j < largestNumbers.length; j++) {
	                if (largestNumbers[i] > largestNumbers[j]) {
	                    int temp = largestNumbers[i];
	                    largestNumbers[i] = largestNumbers[j];
	                    largestNumbers[j] = temp;
	                }
	            }
	        }

	       
	        String[] result = new String[largestNumbers.length];
	        for (int i = 0; i < largestNumbers.length; i++) {
	            result[i] = String.valueOf(largestNumbers[i]);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
		       
	        String[] result1 = getLargestNumbers("01a2b3456cde478");
	        System.out.println("Kết quả: " + String.join(", ", result1)); 

	       
	        String[] result2 = getLargestNumbers("aa6b546c6e22h", "aa6b326c6e22h");
	        System.out.println("Kết quả: " + String.join(", ", result2)); 
	    }
	}
