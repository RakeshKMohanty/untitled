package com.core.ltp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maximubSubArray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        //System.out.println("Input Array is : " + Arrays.stream(nums).boxed().toList());
        //System.out.println("Sum of maximum subArray : " + findMaximumSubArray(nums));
        System.out.println("Sum of maximum subarray : "+findSumOfMaximumSubArray(nums));
    }

    private static int findSumOfMaximumSubArray(int[] nums) {
        System.out.println("Input Array Elements : "+Arrays.stream(nums).boxed().toList());
        int resultSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i =0;i<=nums.length-1;i++){
             currentSum += nums[i];
             resultSum = Math.max(currentSum,resultSum);
             if(currentSum<0)
                 currentSum = 0;
        }
        return resultSum;
    }

    private static int findMaximumSubArray(int[] nums) {
        int resultSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            int currentSum = 0;
            for (int j = i; j <= nums.length - 1; j++) {
                currentSum += nums[j];
                if (currentSum > resultSum) {
                    resultSum = Math.max(currentSum,resultSum);
                    startIndex = i;
                    endIndex = j;

                }
            }
        }
        for (int i = startIndex; i <= endIndex; i++) {
            resultList.add(nums[i]);
        }
        System.out.println("Maximum sub array : " + resultList);
        return resultSum;
    }
}
