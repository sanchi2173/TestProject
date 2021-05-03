package com.java.test;

import java.util.Arrays;

public class MissingElementInIntegerArray {

    public static void main(String args[]){

        int[] arrNum = {5, 7, 9, 1, 6, 10};

        int itr=0;
        Arrays.sort(arrNum);
        int size=arrNum.length;
        int biggestNum=arrNum[size-1];

        boolean found=false;

        while(itr<=biggestNum){
            found=false;
            for(int num: arrNum){
                if(itr==num) {
                    found=true;
                    break;
                }
            }
            if(found==false)
                System.out.println(itr);
            itr++;
        }

    }

}
