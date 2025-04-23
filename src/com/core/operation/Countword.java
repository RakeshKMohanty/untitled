package com.core.operation;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Countword {

    static  String input = "aaaabbcccddddddaa";

    public static void main(String[] args) {
        String result ="";
        int counter = 1;
        for(int i=0;i<=input.length()-2;i++){

            if(input.charAt(i) == input.charAt(i+1) && i!=input.length()-1)
            {
                counter++;
            }

            else {
                result = result + counter + input.charAt(i) ;
                counter = 1;
            }
            //Collections.sort();
        }
        System.out.println(result);
       // input.chars().mapToObj(value -> (char) value)
    }
}
