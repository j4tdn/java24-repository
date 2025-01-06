package exercise;

public class Ex03 {
	public static void main(String[] args) {
		 String n = "Welcome  to JAVA10  class";
		 n = n.replaceAll("  ", " ");
		 String reverseString = "";
		 for(int i = n.length() - 1; i >=0;i--) {
			 reverseString = reverseString + n.charAt(i);			 
		 }
		 
		 
		 System.out.println(n);
		 System.out.println("\n===================================================================\n");
		 System.out.println(" Đảo Ngược của : " + n +  " = " + reverseString);
	}

}
