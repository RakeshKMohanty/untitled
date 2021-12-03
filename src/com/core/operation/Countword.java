package com.core.operation;

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
        }
        System.out.println(result);
    }
}
