package com.java.test.Java;

import java.util.HashMap;

public class CountCharInString {

    public static void main(String args[]){

        String inputStr = "She sells seashells by the seashore!";
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        inputStr = inputStr.toLowerCase();

        for(char ch: inputStr.toCharArray()){
            int count=0;

            if(charMap.containsKey(ch)){
                count = charMap.get(ch);
                charMap.replace(ch, count+1);
            }
            else
                charMap.put(ch, 1);
        }
        System.out.println(charMap);

    }

}
