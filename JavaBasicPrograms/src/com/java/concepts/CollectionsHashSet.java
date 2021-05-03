package com.java.concepts;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsHashSet {
    public static void main(String[] args) {
        HashSet<String> dataSet = new HashSet<>();
        dataSet.add("Two");
        dataSet.add("Seven");
        dataSet.add("Nine");
        dataSet.add("Eight");
        dataSet.add("");

        System.out.println(dataSet);

        Iterator itr = dataSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
