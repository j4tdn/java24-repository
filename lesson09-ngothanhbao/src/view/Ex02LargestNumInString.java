package view;

public class Ex02LargestNumInString {
	
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		String s2 = "aa6b546c6e22h";
		getMaxNum(s1);
		
	}
	
	public static void getMaxNum(String strs) {
		String[] nums = strs.split("[^0-9]+");
		int max = 0;
		for(String num : nums) {
			int number = Integer.parseInt(num);
			if(max < number) {
				max = number;
			}
		}
		System.out.println("Max --> " + max);
	}

	
}
