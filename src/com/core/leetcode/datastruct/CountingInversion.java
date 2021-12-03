package com.core.leetcode.datastruct;

public class CountingInversion {
    public static void main(String[] args) {
        int input[] = {9, 6, 8, 4};
        int input1[] = {1,20,6,7,5,8,11,3};
        System.out.println(countingInversionInArray(input1));
    }

    private static int countingInversionInArray(int[] input) {
        int i = 0, j = i + 1, count = 0, size = input.length;
        do {
            if (input[i] > input[j]) {
                count++;
            }
            if (j < input.length - 1)
                j++;
            else {
                i++;
                j=i+1;
            }
        } while (i <= input.length - 2 && j <= input.length - 1);
        return count;
    }

}
