package com.core.leetcode.stringq;
//FInd first unique-charachter in string
public class uniquecharchter {
   public static String findUnique(String input){

        for(int i =0; i<=input.length()-1;i++){
            char c = input.charAt(i);
            if(input.indexOf(c) != input.lastIndexOf(c) )
            {
                return String.valueOf(c);

            }

        }
         return "There is no repeated Charachter in "+input;
    }
    public static void main(String[] args) {
       String input = "abcdbcea";
       String input1= "abcdefgh";
        System.out.println("The first unique charachter is : "+ findUnique(input));
    }
}
