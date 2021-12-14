package com.core.leetcode.datastruct;

public class matrix {
    public static void main(String[] args) {
        //int[][] a= new int[3][4];
        int[][] input = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};

        //createMatrix(2,4,a);
        iterateMatrix(4,4,input);
        int count = findsqMatrixWith1s(input,2);
        System.out.println("\nTotal number of square matrix is "+count+" with 2 dimension");
    }

    private static int findsqMatrixWith1s(int[][] input,int sqsize) {
        int count =0;
        for(int i =0;i<= input.length-sqsize;i++){
            inner:for (int j=0;j<=input[0].length-sqsize;j++){
                if(input[i][j] != 0){
                    for(int k=i;k<=i+(sqsize-1);k++){
                        for (int l=j;l<=j+(sqsize-1);l++){
                            if(input[k][l]!= 1)
                                continue inner;
                        }
                    }
                    count++;
                }
            }
           // count++;
        }
        return count;
    }

    private static void createMatrix(int row,int column,int a[][]) {
        for(int i=0;i<=row-1;i++ ){
            //System.out.println("inner loop start");
            for (int j=0;j<=column-1;j++){
                a[i][j] =(i+1)*10+j+1;
            }
            //System.out.println("outer loop");
        }
    }

    private static void iterateMatrix(int row, int column,int a[][]) {
        for(int i=0;i<=row-1;i++ ){
            System.out.println();
            for (int j=0;j<=column-1;j++){
                System.out.print(" "+a[i][j]);
            }
        }
        System.out.println("prdemo branch pull request");
    }
}
