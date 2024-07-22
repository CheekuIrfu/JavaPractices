package com.irfan.practice;

public class Binary {
        public static void main(String[] args) {
            int[] nums1 = {1, 1, 0, 1, 1, 1};
            int[] nums2 = {1, 0, 1, 1, 0, 1};

            System.out.println("The sum of the maximum consecutive 1s is: " + findMaxConsecutiveOnesSum(nums1));
            System.out.println("The sum of the maximum consecutive 1s is: " + findMaxConsecutiveOnesSum(nums2));
        }

        public static int findMaxConsecutiveOnesSum(int[] nums) {
            int maximumCount = 0;
            int currentCount = 0;
            int maxSum = 0;
            int segmentSum = 0;

            for (int num : nums) {
                if (num == 1) {
                    currentCount++;
                    if (currentCount > maximumCount) {
                        maximumCount = currentCount;
                        segmentSum = maximumCount;
                    } else if (currentCount == maximumCount) {
                        segmentSum += currentCount;
                    }
                } else {
                    if (currentCount == maximumCount) {
                        maxSum += segmentSum;
                    }
                    currentCount = 0;
                    segmentSum = 0;
                }
            }

            if (currentCount == maximumCount) {
                maxSum += segmentSum;
            }

            return maxSum;
        }
    }


