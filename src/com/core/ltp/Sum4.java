package com.core.ltp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
                //{-2,-1,-1,1,1,2,2};
                //{1, 0, -1, 0, -2, 2};
        //{2,2,2,2,2}
        int target = 8;
        //System.out.println("nums : "+nums);
        System.out.println("\nresult : "+fourSum(nums, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        //-2,-1,0,0,1,2
        Arrays.sort(nums);
        Arrays.stream(nums).forEach(System.out::print);
        //System.out.println(List.of(nums));
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j <= nums.length - 2;j++) {
                /*if ( nums[j] == nums[j + 1])
                    continue;*/

                int p = j + 1;
                int q = nums.length - 1;



                while (p < q) {
                    List<Integer> quadraplet = new ArrayList<>();
                    int sum = nums[i] + nums[j] + nums[p] + nums[q];
                    if (sum < target )
                        p++;
                   else if (sum > target)
                        q--;
                   else {
                        quadraplet.add(nums[i]);
                        quadraplet.add(nums[j]);
                        quadraplet.add(nums[p]);
                        quadraplet.add(nums[q]);
                        result.add(quadraplet);
                        p++;q--;
                        while( p<q && nums[p] == nums[p-1] )
                            p++;
                    }

                }
               // j++;
                while (j <nums.length && nums[j] == nums[j - 1])
                    j++;
            }
        }
        return result;
    }
}
