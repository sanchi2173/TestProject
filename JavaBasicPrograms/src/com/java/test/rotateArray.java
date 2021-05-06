package com.java.test;

import java.util.Arrays;

public class rotateArray {
    /* Example -
        a:
        [[1,2,3],
         [4,5,6],
         [7,8,9]]

        a: [[1]]

        a:
        [[10,9,6,3,7],
         [6,10,2,9,7],
         [7,6,3,8,2],
         [8,9,7,9,9],
         [6,8,6,8,2]]
     */



    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int b[][] = rotateImage(a);
        for(int i=0; i<=b.length-1; i++){
            System.out.println(Arrays.toString(b[i]));
        }

    }

    public static int[][] rotateImage(int[][] a) {

        int b[][] = new int[a.length][a[0].length];

        for(int i=0,k=a.length-1; i<=a.length-1 && k>=0; i++, k--){
            for(int j=0; j<=a[i].length-1; j++){
                b[j][k] = a[i][j];
            }
        }

        return b;

    }

}
