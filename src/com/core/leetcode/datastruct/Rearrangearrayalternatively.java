package com.core.leetcode.datastruct;

import java.util.Arrays;

public class Rearrangearrayalternatively {

    static int a[] = {3, 4, 5, 6, 7, 9, 13};
    //O/P : 13,3,9,4,7,5,6

    static int b[] = {4, 5, 6, 7, 8, 13, 15, 17};
    //O/P : 17,4,15,5,13,6,8,7

    public static int[] rearrange(int a[]) {

        int largenumber = a.length - 1;
        int smallnumber = 0;
        int counter = 0;
        int[] result = new int[a.length];

        while (counter <= a.length - 1) {

            if (counter % 2 == 0) {
                result[counter] = a[largenumber];
                System.out.print(" " + a[largenumber] + " ");
                largenumber--;
            } else {
                result[counter] = a[smallnumber];
                System.out.print(" " + a[smallnumber] + " ");
                smallnumber++;
            }
            counter++;

        }
        return result;
    }

    public static void main(String[] args) {

        int[] result = rearrange(b);
        System.out.println("\n"+Arrays.toString(result));
    }
}
