package com.java.test.Java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {

    public static void main(String args[]){

        int[] arrNum = {3,7,1,0,0,4,5,3,86,1};
        Arrays.sort(arrNum);

        for(int i: arrNum){
            System.out.println(i);
        }
    }
}
