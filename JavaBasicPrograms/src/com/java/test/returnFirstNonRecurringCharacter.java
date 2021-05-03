package com.java.test;

import java.util.HashMap;

public class returnFirstNonRecurringCharacter {

    public static void main(String[] args) {
        String inputStr="AABBCC";

        HashMap<Character, Integer> dataMap = new HashMap<>();
        for(char ch: inputStr.toCharArray()){
            if(dataMap.containsKey(ch)){
                int count = dataMap.get(ch);
                dataMap.put(ch, count+1);
            }
            else
                dataMap.put(ch, 1);
        }

        Boolean dataFound=false;
        for(char ch: inputStr.toCharArray()){
            if(dataMap.get(ch)==1){
                System.out.println("First recurring non character: " +ch);
                dataFound=true;
                break;
            }
        }
        System.out.println(dataFound ? "Non recurring character found" : "String does not contain a non recurring character");
    }
}
