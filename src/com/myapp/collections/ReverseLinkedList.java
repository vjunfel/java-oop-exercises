package com.myapp.collections;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public void reverseLinkedList() {

        System.out.println("*****************************");
        System.out.println("ReverseLinkedList.");
        System.out.println("*****************************");

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Mango");
        list1.add("Banana");

        System.out.println("Original: " + list1);

        Collections.sort(list1); // #Sort
        System.out.println("Sorted: " + list1);

        Collections.reverse(list1); // option 1 - #Reverse
        System.out.println("Reversed using Collections:");
        System.out.println(list1);

        LinkedList<String> rList = new LinkedList<>();
        for (String l : list1) {
            rList.addFirst(l); // option 2 - manual
        }

        System.out.println("Manual Reversed:");
        System.out.println(rList);

        Collections.shuffle(list1); // #Shuffle
        System.out.println("Shuffle: " + list1);
    }
}
