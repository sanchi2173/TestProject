package com.java.concepts;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsArrayList {

    public static void main(String args[]){

        ArrayList<String> arrListFruits = new ArrayList();
        arrListFruits.add("Mango");
        arrListFruits.add("Apple");
        arrListFruits.add("Jackfruit");
        arrListFruits.add("Coconut");

        System.out.println(arrListFruits);

        System.out.println("");
        System.out.println("Print array elements using iterator");
        Iterator itr = arrListFruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("");
        System.out.println("Print array elements using For Each loop");
        for(String fruits: arrListFruits){
            System.out.println(fruits);
        }

        System.out.println("");
        System.out.println("Added a fruit");
        arrListFruits.add(2, "Pomegranate");
        System.out.println(arrListFruits);

        System.out.println("");
        System.out.println("Sorted array list");
        Collections.sort(arrListFruits);
        System.out.println(arrListFruits);

        System.out.println("");
        System.out.println("Sorted array list in REVERSE order");
        Collections.sort(arrListFruits, Collections.reverseOrder());
        System.out.println(arrListFruits);
    }
}
