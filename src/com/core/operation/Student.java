/*
package com.core.operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {


    public static void main(String[] args) {
        List<String> books = new ArrayList();
        books.add("Programming");
        books.add("Database");
        books.add("aptitude");
        books.add("Database");
        books.add("deployment");

        Map<Integer,List<String>> msp = new HashMap();
        msp.put(001,List.of("programming", "database", "aptitude"));
        msp.put(002,List.of("aptitude"));
        msp.put(003,List.of("deployment", "programming"));
        msp.put(004,List.of("analysis", "testing", "programming"));

        Map<String,Integer> result = new HashMap<>();


        List<String> collect = msp.keySet().stream().
                flatMap(id ->
                {
                   if( !result.containsKey(msp.get(id))){
                       result.put(id,msp.get(id))
                   }
                })
                                .collect(Collectors.toList());
        System.out.println(collect);

        for(int i=0;i<)
    }

}*/
