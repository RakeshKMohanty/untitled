package com.core.operation;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Countwords {

    public static Map<String,Integer> countWords(String str) {
        String mystring = str;
        String[] words = mystring.split(" ");
        Map<String,Integer> mp = new HashMap<>();
        for(String word :words ){
            if(mp.keySet().contains(word)){
                mp.put(word,mp.get(word)+1);
            }
            else mp.put(word,1);
        }
        return mp;

    }

    public static void reverseString(String s){
       String inputString =s;
        System.out.println("Reverse String");
       for (int i=s.length()-1;i>=0;i--){
           System.out.print(s.charAt(i));
       }

    }
    public static void main(String[] args) {
    String str = "my name is rakesh is my name";
        Map<String, Integer> result = countWords(str);
        result.forEach((word, occurance) -> System.out.println("word "+word+" occurance "+occurance));
        reverseString("Rakesh");
    }
}
