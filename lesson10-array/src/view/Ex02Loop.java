package view;

public class Ex02Loop {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        for(int num: nums) {
            System.out.print(num);
        }

    }
}
