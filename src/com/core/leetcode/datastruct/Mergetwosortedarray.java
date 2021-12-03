package com.core.leetcode.datastruct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mergetwosortedarray {
    public static void main(String[] args) {
        int a1[] = {1,3,5,7};
        int a2[] = {0,6,2,8,9,11};
        sortArray(a1,a2);
        List<Integer> list = Arrays.stream(a1).boxed().collect(Collectors.toList());
        System.out.println(list);
        System.out.println("Sorted array : "+Arrays.toString(a1)+Arrays.toString(a2));
    }

    private static void sortArray(int a1[],int a2[]) {
        for(int i=0;i<=a1.length-1;i++){
            for(int j=0;j<=a2.length-1;j++){
                if(a1[i]>a2[j])
                {
                    int temp = a1[i];
                    a1[i] = a2[j];
                    a2[j] = temp;
                    break ;
                }

            }
            Arrays.sort(a2);

        }
    }
}
