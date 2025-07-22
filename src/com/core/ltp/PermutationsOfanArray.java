package com.core.ltp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfanArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        System.out.println("All possible permutations : " + findPossiblePermutations(input));
        System.out.println("All possible permutation in alternative way :"+findPossiblePermutations2(input));
    }

    private static List<List<Integer>> findPossiblePermutations2(int[] input) {

        List<List<Integer>> result = new ArrayList<>();

        return result;
    }

    private static List<List<Integer>> findPossiblePermutations(int[] input) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = Arrays.stream(input).boxed().toList();

        if (input.length == 1) {
            result.add(list);
            return result;
        } else if (input.length == 2) {
            result.add(List.of(input[0], input[1]));
            result.add(List.of(input[1], input[0]));
            return result;
        } else {
            for (int i = 0; i <= input.length - 3; i++) {
                for (int j = i + 1; j <= input.length - 2; j++) {
                    for (int k = j + 1; k <= input.length - 1; k++) {
                        List<Integer> output = new ArrayList<>();
                        result.add(List.of(input[i], input[j], input[k]));
                        result.add(List.of(input[i], input[k], input[j]));
                        result.add(List.of(input[j], input[k], input[i]));
                        result.add(List.of(input[j], input[i], input[k]));
                        result.add(List.of(input[k], input[j], input[i]));
                        result.add(List.of(input[k], input[i], input[j]));
                    }
                }
            }
            System.out.println("Total permutations number : " + result.size());
            return result;
        }
    }
}
