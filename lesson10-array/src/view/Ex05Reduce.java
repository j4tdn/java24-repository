package view;

import functional.Reduce;

public class Ex05Reduce {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(reduce(nums, 0,(res, number) -> res+number));
        System.out.println(reduce(nums, 1,(res, number) -> res*number));
        System.out.println(reduce(nums, Integer.MIN_VALUE,(res, number) -> Math.max(res, number)));
        System.out.println(reduce(nums, Integer.MAX_VALUE,(res, number) -> Math.min(res, number)));
    }

    private static int reduce(int[] nums, int initial, Reduce reduce) {
        int res = initial;

        for (int i = 1; i < nums.length; i++) {
            res = reduce.reduce(res, nums[i]);
        }

        return res;
    }

}
