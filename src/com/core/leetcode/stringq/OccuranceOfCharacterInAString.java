package com.core.leetcode.stringq;

import java.util.Arrays;
import java.util.Map;
import java.util.Queue;
import java.util.function.Function;
import java.util.stream.Collectors.*;

import static java.util.stream.Collectors.*;

public class OccuranceOfCharacterInAString {
    public static String input = "Java is a robust language";

    public static void main(String[] args) {
        //System.out.println(input.chars().mapToObj(value -> (char)value).);
        Map<Character, Long> collect = input.chars().mapToObj(charachter -> (char) charachter)
                .filter(letter -> letter != ' ')
                .collect(groupingBy(Function.identity(), counting()));
        
       // .collect(groupingBy(Function.identity(), collectingAndThen(filtering(counting()>1,counting()))));
        collect.forEach((key, value) -> System.out.println("key : "+key+" Value: "+value) );
       // Arrays.sort();

    }
}
