package com.irfan.practice;

public class NonEmptyArray {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        NonEmptyArray solution = new NonEmptyArray();
        int[] nums1 = {2, 2, 1};
        System.out.println("Single number in [2, 2, 1]: " + solution.singleNumber(nums1));

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Single number in [4, 1, 2, 1, 2]: " + solution.singleNumber(nums2));

        int[] nums3 = {1};
        System.out.println("Single number in [1]: " + solution.singleNumber(nums3));
    }
}
