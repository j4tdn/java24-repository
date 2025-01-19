package view;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Ex02 {

	public static void main(String[] args) {
		
		// Bài toán tạm ổn cho 1 chuỗi
		// Khi nào code các biết không dùng em nên xóa hết nghen
		
		String n1 = "fgds12331hjkdsfbn324324fcdsfd";
		String[] words = n1.split("[a-zA-Z]+"); // A nhớ từng chỉ pattern cắt 1 lần rồi
		// Em làm như này lỡ chuỗi gồm các kí tự khác ngoài a-zA-Z thì bài toán sai
		
		for (int i = 0; i < words.length; i ++) {
			if(words[i].isEmpty()) {
				words[i] = "0"; // Em nên bỏ qua chứ không chuyển qua 0
			}
		}
		
		int[] arrs = new int[words.length];
		for(int i = 0; i < words.length; i ++) {
			arrs[i] = Integer.parseInt(words[i]);
			
		}
		
		
		System.out.println(Arrays.toString(arrs));


	}
}
