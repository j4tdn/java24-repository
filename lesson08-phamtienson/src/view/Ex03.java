package view;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Scanner;



public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi tiếng Việt có dấu: ");
		String input = ip.nextLine();
		
        String result = unmarked(input);
         System.out.println(" Chuỗi tiếng Việt không dấu là: "+ result);
	}
        
        private static String unmarked(String s) {
        	String normalized = Normalizer.normalize(s, Form.NFD);
        	String noAccent = normalized.replaceAll("\\p{M}+","");
        	return noAccent.replaceAll("đ", "d").replaceAll("Đ", "D");
        }
}
        
	
        
    
		
		
		
	


