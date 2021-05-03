package com.java.concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionsHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> dataMap = new HashMap();
        dataMap.put(4, "Sanchi");
        dataMap.put(7, "Hemu");
        dataMap.put(1, "Apeksha");
        dataMap.put(2, "Rosh");
        System.out.println(dataMap);

        System.out.println();System.out.println("Print Hash Map using iterator");
        Iterator itr = dataMap.values().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();System.out.println("Print Hash Map using For Each loop");
        for (String names: dataMap.values()){
            System.out.println(names);
        }

        System.out.println();System.out.println("Print Hash Map using Map set");
        for(Map.Entry m: dataMap.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }
}
