package com.core.ltp;

import java.util.*;
import java.util.stream.Collectors;

public class Subsets {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(24,34,23,12,7,56,41,14,90,10,7,11,77,85);
        //numberList.stream().max(Comparator.comparingInt(value -> )) .
        int maxNumber = numberList.stream().distinct().max(java.util.Comparator.naturalOrder()).get();
        System.out.println(maxNumber);
        //numberList.add(1);
        //List<String> l = Arrays.asList("A", "B", "C", "D");
        //long count = l.stream().peek(System.out::println).count();
        //System.out.println(count);
        //numberList.stream().max()
    }
}
