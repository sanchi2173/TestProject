package com.java.test;

import java.util.HashMap;

public class returnFirstRecurringCharacter {
    public static void main(String[] args) {
        // #1: First Recurring Character
        String inputStr="ABCKLAVFTHB";

        HashMap<Character, Integer> dataMap = new HashMap<>();
        Boolean charFound=false;
        for(char ch: inputStr.toCharArray()){
            if(dataMap.containsKey(ch)){
                System.out.println("First recurring character: "+ch);
                charFound=true;
                break;
            }
            else
                dataMap.put(ch, 1);
        }

        String msg = charFound ? "Char found... yayy" : "No recurring character in the input string";
        System.out.println(msg);
        System.out.println("The End!");
    }
}
