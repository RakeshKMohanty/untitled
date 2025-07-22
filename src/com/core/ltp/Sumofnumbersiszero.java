package com.core.ltp;

import java.util.*;
import java.util.stream.Collectors;

//import static java.util.Arrays.sort;

/*
3Sum -> Leetcode
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
 and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]/[-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0]/[0,0,0]/[0,1,1]
 Output: [[-1,-1,2],[-1,0,1]]/[[-5,1,4],[-4,0,4],[-4,1,3],[-2,-2,4],[-2,1,1],[0,0,0]]/[0,0,0]/[]
*/
public class Sumofnumbersiszero {

    public static void main(String[] args) {
        int[] nums = {0,1,1};
        long startTime = System.currentTimeMillis();
        //System.out.println("Output : " + findSum2(nums));
        //Two pointer approach
        System.out.println("Output : " + findSum3(nums));
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken in Milliseconds : " + (endTime - startTime));

    }

    private static List<List<Integer>> findSum3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
                else {
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[j]);
                    triplets.add(nums[k]);
                    result.add(triplets);
                    j++;k--;
                    // Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }

            }

        }
        return result;
    }

    private static List<List<Integer>> findSum2(int[] nums) {

        List<Integer> inputnumbers = Arrays.stream(nums).boxed().toList();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= inputnumbers.size() - 2; i++) {
            for (int j = i + 1; j <= inputnumbers.size() - 1; j++) {
                int sum = -(inputnumbers.get(i) + inputnumbers.get(j));
                if (inputnumbers.contains(sum) && inputnumbers.indexOf(sum) != i && inputnumbers.indexOf(sum) != j) {

                    List<Integer> numberList = new ArrayList<>();
                    numberList.add(inputnumbers.get(i));
                    numberList.add(inputnumbers.get(j));
                    numberList.add(sum);
                    Collections.sort(numberList);
                    if (result.isEmpty()) {
                        result.add(numberList);
                    } else {
                        ListIterator<List<Integer>> listListIterator = result.listIterator();
                        boolean listExist = true;
                        while (listListIterator.hasNext()) {
                            List<Integer> next = listListIterator.next();
                            if (numberList.containsAll(next)) {
                                listExist = false;
                                break;
                            }
                        }
                        if (listExist)
                            result.add(numberList);
                    }
                }
            }
        }
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(0) != o2.get(0))
                    return o1.get(0).compareTo(o2.get(0));
                else if (o1.get(1) != o2.get(1))
                    return o1.get(1).compareTo(o2.get(1));
                else return o1.getLast().compareTo(o2.getLast());

            }
        });
        return result;
    }
}
