package com.java.test;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        String inputStr="56974512";
        int sum =0;

        for(char ch: inputStr.toCharArray()){
            String s = String.valueOf(ch);
            int i = Integer.parseInt(s);

            sum = sum + i;
        }
        System.out.println(sum);
    }
}
