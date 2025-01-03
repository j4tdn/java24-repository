package view;
import java.util.Scanner;

public class Ex01 {
	

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//In ra mỗi kí tự trên một dòng
		System.out.print("Nhập chuỗi (tiếng Việt): ");
		String s = ip.nextLine();
		
		System.out.println("In các ký tự");
		for(int i = 0; i < s.length(); i++ ) {
			System.out.println(s.charAt(i));
		}
		
		//In ra mỗi từ trên mỗi dòng
		String[] words = s.split("\\s");
		System.out.println("In các từ: ");
		for(String word:words) {
			System.out.println(word);
		}
		
		//In ra chuỗi đảo ngược theo kí tự
		System.out.println("In các ký tự đảo ngược:");
	    for (int i = s.length() - 1; i >= 0; i--) { 
	            System.out.println(s.charAt(i));
	        }
	    //In ra chuỗi đảo ngược theo từ
		System.out.println("In các từ đảo ngược: ");
		for(int i = words.length - 1; i >= 0; i --) {
			System.out.println(words[i]);
		}
		
	}
}
