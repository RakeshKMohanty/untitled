package com.core;

import com.core.operation.Streamoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        //op : a2b1c5a3
        System.out.println(getFrequencyOfCharachter(input));
        getFrequencyOfCharachter2(input);
    }

    private static void getFrequencyOfCharachter2(String input) {
        input.chars().mapToObj(value -> (char)value)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> {
                    System.out.println("key : "+key+" value : "+value);
                } );
    }

    private static String getFrequencyOfCharachter(String input) {
        String output = "";
        for (int i = 0; i <= input.length() - 1; i++) {
            output = output + input.charAt(i);
            int count = 1;
            for (int j = i + 1; j <= input.length() - 1; j++) {
                if (input.charAt(i) != input.charAt(j)) {
                    i = j - 1;
                    break;
                } else {
                    i = j;
                    count++;
                }
            }
            output = output + count;
        }
        return output;
    }
}
