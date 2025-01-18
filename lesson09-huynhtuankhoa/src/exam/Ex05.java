package exam;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		String number = "44";
		boolean isHappyNumber = false;
		int i = 0;
		
		// A chưa hiểu vụ i != 20 này lắm
		while (i != 20) {
			number = getEachNum(number);
			if (number.equals("1")) {
				isHappyNumber = true;
				break;
			} 
			i++;
		}
		System.out.println(isHappyNumber? true : false);
	}
	
	// Cách này cũng được hoặc em có thể %10 để lấy ra từ số
	public static String getEachNum(String num) {
		StringBuilder newNum = new StringBuilder();
		String[] nums = num.split("");
		int stNum = Integer.parseInt(nums[0]);
		int ndNum = Integer.parseInt(nums[1]);
		newNum.append((stNum * stNum) + (ndNum * ndNum));
		return newNum.toString();
	}
}	
	
	
