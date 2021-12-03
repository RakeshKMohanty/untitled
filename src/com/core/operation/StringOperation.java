package com.core.operation;

import java.util.*;
import java.util.stream.Collectors;

public class StringOperation {
    static String s= "zaabcccda";
    public static void main(String args[]){
        int index = s.indexOf("a");
        int lastindex = s.lastIndexOf("a");
        if(s.substring(index+1,s.length()-1).contains(String.valueOf(s.charAt(index))))
        System.out.println(lastindex);

        Map mp = new HashMap();
        mp.put("z","a");
        mp.put("n","b");
        mp.put("v","b");
        mp.put("f","d");
        mp.put("q","e");
        mp.put("o","f");
        mp.put("r","g");

        mp.forEach((key, value) -> System.out.println("Key: "+key+" value: "+value ) );

        Map mp1 = new TreeMap(mp);

        mp1.forEach((key,value) -> System.out.println("Tree key : "+key+" Tree value: "+value));

         List<String> list  = new LinkedList<>(mp.values());
         Collections.sort(list);


        /*list = mp.values().stream().
                filter(value -> {
                    if(!list.contains(value))
                        list.add(String.valueOf(value));
                    Collections.sort(list);
                    return true;

                }).collect(Collectors.toList());
               */


    }
}
