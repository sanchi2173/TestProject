package com.java.test;

public class ReverseAString {
    public static void main(String[] args){
        String inputStr = "Sanchita Ramsharma + Himanshu Kalloo";

        Method1(inputStr);
        Method2(inputStr);
    }

    private static void Method1(String inputString){
        String revStr="";
        for (char ch: inputString.toCharArray()) {
            revStr = String.valueOf(ch) + revStr;
        }
        System.out.println("Method 1: " + revStr);
    }

    private static void Method2(String inputString){
        String revStr="";
        for(int i=0; i<inputString.length(); i++){
            revStr = inputString.charAt(i) + revStr;
        }
        System.out.println("Method 2: " + revStr);
    }
}
