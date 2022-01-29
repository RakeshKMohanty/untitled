
package com.core.leetcode.datastruct;

import java.util.Arrays;

public class Mergesort {

    static int a[] = {7, 5, 2, 3, 4, 1, 8, 6, 9};
    static String b[] = {"a", "b", "c"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(a));
       // mergeSort(a);
       // mergeSort()
        int returnvalue = main(5);
        System.out.println("return value : " + returnvalue);
        //System.out.println(Arrays.toString(a));
    }

    public static int main( int args) {
        int returnvalue = 0;
        try {
            return returnvalue = args / 0;
        }
catch (ArithmeticException ae) {
           // returnvalue = 5;
            return 7;

        }
finally {
            //returnvalue = 10;
            return 10;
        }
        //System.out.println(null);
        //System.out.println("In 2nd main method");
        //return returnvalue;
    }

   /* private static int mergeSort(int input[]) {
    return 0;
    }*/

    private static void mergeSort(int input[]) {

        if (input.length < 2)
            return;

        int middle = input.length / 2;
        int lefthalf[] = new int[middle];
        for (int i = 0; i < middle; i++) {
            lefthalf[i] = input[i];
        }
        int righthalf[] = new int[input.length - middle];

        for (int i = middle; i < input.length; i++) {
            righthalf[i - middle] = input[i];

        }
        mergeSort(lefthalf);
        mergeSort(righthalf);
        merge(input, lefthalf, righthalf);
    }

    private static void merge(int[] input, int[] lefthalf, int[] righthalf) {
        int b[] = new int[lefthalf.length + righthalf.length];
        int i = 0, j = 0, k = 0;
        while (i < lefthalf.length && j < righthalf.length) {

            if (lefthalf[i] <= righthalf[j]) {
                input[k++] = lefthalf[i++];
                //b[k++] = lefthalf[i++];
            } else {
                input[k++] = righthalf[j++];
                //b[k++] = righthalf[j++];
            }

        }
        while (i < lefthalf.length) {
            input[k++] = lefthalf[i++];
            //b[k++] = lefthalf[i++];
        }
        while (j < righthalf.length) {
            input[k++] = righthalf[j++];
            //b[k++] = righthalf[j++];
        }

        System.out.println(Arrays.toString(input));
        //System.out.println(Arrays.toString(b));
    }

}

