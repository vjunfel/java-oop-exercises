package com.myapp.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MyMaps {
    public void myMaps() {
        System.out.println("*****************************");
        System.out.println("Using Map.");
        System.out.println("*****************************");

        // HashMap, LinkedHashMap, TreeMap, Hashtable, ConcurrentHashMap

        // #HashMap - Unorderd, allows null key/values, Fast lookup O(1)
        Map<Integer, String> hashmap = new HashMap<>();

        hashmap.put(1, "Mitsubishi");
        hashmap.put(2, "Toyota");
        hashmap.put(3, "Honda");
        hashmap.put(null, null);

        System.out.println("HashMap: " + hashmap);

        // #LinkedHashMap - Insertion order, Allows null key/values, Slightly slower than HashMap
        Map<String, Integer> linkedMap = new LinkedHashMap<>();

        linkedMap.put("Alice", 25);
        linkedMap.put("Charlie", 34);
        linkedMap.put("Bob", 18);
        linkedMap.put(null, null);

        System.out.println("LinkedHashMap: " + linkedMap);

        // #TreeMap - Sorted by key (Alphanumerically), Does NOT allow null key
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Zebra");
        treeMap.put(5, "Fish");
        treeMap.put(59, "Bird");
        treeMap.put(32, null);

        System.out.println("TreeMap: " + treeMap);

        // #Hashtable - Legacy, Thread-safe, Does Not allow null key/value, Unordered
        Map<String, Integer> table = new Hashtable<>();

        table.put("Alice", 25);
        table.put("Bob", 30);
        table.put("Charlie", 22);

        System.out.println("Hashtable: " + table);

        // #ConcurrentHashMap - Modern, Thread-safe, read at the same time, write at the same time (without locking the whole map), Unordered
        Map<String, Integer> map = new ConcurrentHashMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);

        System.out.println(map.get("Alice")); // 25

        map.put("Alice", 26); // safe update
        System.out.println("ConcurrentHashMap: " + map);

        // #WeakHashMap - Garbage collected if no longer reference.
        Map<Object, String> weakHashMap = new WeakHashMap<>();

        Object objKey1 = new Object();
        Object objKey2 = new Object();
        Object objKey3 = new Object();

        weakHashMap.put(objKey1, "name");
        weakHashMap.put(objKey2, "age");
        weakHashMap.put(objKey3, "location");

        System.out.println("WeakHashMap: " + weakHashMap.get(objKey1));
        System.out.println("WeakHashMap: " + weakHashMap.get(objKey2));
        System.out.println("WeakHashMap: " + weakHashMap.get(objKey3));
    }
}
