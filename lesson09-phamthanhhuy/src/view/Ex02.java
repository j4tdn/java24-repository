package view;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Ex02 {

	public static void main(String[] args) {

		String n1 = "fgds12331hjkdsfbn324324fcdsfd";
		String n2 = "fsdbhdsfdsgfdf";
		
		String[] words = n1.split("[a-zA-Z]+");
		
		int max = 0;
		int count =  0;
		
		for (int i = 0; i < words.length; i ++) {
			if(words[i].isEmpty()) {
				words[i] = "0";
			}
		}
		
		int[] arrs = new int[words.length];
		for(int i = 0; i < words.length; i ++) {
			arrs[i] = Integer.parseInt(words[i]);
			
		}
		
		
		System.out.println(Arrays.toString(arrs));


	}
}
