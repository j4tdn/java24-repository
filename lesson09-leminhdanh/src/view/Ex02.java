package view;

import utils.StringUtils;

public class Ex02 {
	public static void main(String[] args) {
		String[] strs = {"aa6b546c6e22h", "aa6b326c6e22h"};
		for(String str:strs) {
			System.out.println(StringUtils.biggestNumber(str) + "\t");
		}
	}
}
