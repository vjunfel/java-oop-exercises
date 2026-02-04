package com.myapp.collections;

import java.util.*;

public class MyCollections {

    // USING REGULAR ARRAY
    public void regularArray() {
        System.out.println("*****************************");
        System.out.println("Using Regular Array.");
        System.out.println("*****************************");

        String[] cars = new String[3];
        cars[0] = "Mitsubishi";
        cars[1] = "Toyota";
        cars[2] = "Honda";

        System.out.println("Using For loop:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("--------------------------------");
        String[] fruits = {"Mango", "Apple", "Banana"};

        System.out.println("Using For loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("--------------------------------");
        Number[] numbers = {1, 2, 3};
//        numbers[3] = 4; // error

        System.out.println("Looping Numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    /*

    // ********* JAVA COLLECTION FRAMEWORK (JCF) **********

    # Key collection interfaces in the framework
    List	    Ordered collection, allows duplicates, index-based access	    ArrayList, LinkedList, Vector
    Set	        No duplicates, unordered (unless special type)	                HashSet, LinkedHashSet, TreeSet
    Queue	    FIFO collection, allows adding/removing at ends	                LinkedList, ArrayDeque, PriorityQueue
    Deque	    Double-ended queue (add/remove both ends)	                    LinkedList, ArrayDeque

                    Collection
                  /      |      \
               List     Set     Queue
              /   \           /        \
     ArrayList  LinkedList  LinkedList  ArrayDeque
     Vector   ...          PriorityQueue  ...


    Map	        Key-value pairs (NOT a Collection)	                            HashMap, LinkedHashMap, TreeMap, Hashtable

    Map (not a Collection)
     ├─ HashMap
     ├─ TreeMap
     └─ LinkedHashMap

     # Utility Collections - class with static methods (ex. sort)
     Collections.sort(list)
     Collections.reverse(list)
     Collections.shuffle(list)

    */

    // ******************* ArrayList **********************
    public void arrayList() {
        System.out.println("*****************************");
        System.out.println("Using List - ArrayList.");
        System.out.println("*****************************");

        // List INTERFACE - ArrayList
        List<String> list = new ArrayList<>();

        list.add("Ferrari");
        list.add("Lamborghini");
        list.add("Range Rover");

        System.out.println("Using FOREACH loop:");
        System.out.println("-----------------------------------");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("Using regular FOR loop in List: ");
        System.out.println("-----------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------------------------------");
        System.out.println("GET: " + list.get(1));

    }

    // ****************** LinkedList *******************
    public void linkedList() {
        System.out.println("*****************************");
        System.out.println("Using LinkedList - LinkedList.");
        System.out.println("*****************************");

        // Linkedlist INTERFACE - LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("L");
        list.add("M");
        list.add("N");

        System.out.println(list); // [A, B, C]

        // LinkedList specific method
        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }

    public void list() {
        System.out.println("*****************************");
        System.out.println("Using List - LinkedList.");
        System.out.println("*****************************");

        // List INTERFACE - LinkedList
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list); // [A, B, C, D]

        // List method
        list.add("E");
        System.out.println("Add E: " + list ); // [A, B, C, D, E]

        String index = list.get(2); // index number -> return value
        System.out.println("Get index: " + index); // C
        System.out.println("Get index2: " + list.get(2)); // C

        System.out.println(list + " - FULL LIST");
        System.out.println("Remove using index: 2");
        list.remove(2); // return the removed item
        System.out.println(list);

        System.out.println("Remove using value: D");
        list.remove("D"); // return boolean
        System.out.println(list);

        list.add(2, "Z"); // add element by index
        System.out.println(list);

        System.out.println("indexOf Z: " + list.indexOf("Z"));
        System.out.println("List Size: " + list.size());
        list.clear();
        System.out.println("List Size: " + list.size());
        System.out.println("isEmpty: " + list.isEmpty());
    }

    public void deque() {
        System.out.println("*****************************");
        System.out.println("Using Deque - LinkedList.");
        System.out.println("*****************************");

        // Deque INTERFACE - (double-ended) - LIFO
        Deque<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);

        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }

    public void queue() {
        System.out.println("*****************************");
        System.out.println("Using Queue - LinkedList.");
        System.out.println("*****************************");

        // Queue INTERFACE - FIFO
        Queue<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        list.poll(); // removes "A"

        System.out.println(list);
    }

    // ****************** ArrayDeque ********************
    public void deqArrayDeque() {
        System.out.println("*****************************");
        System.out.println("Using Deque - DequeArray.");
        System.out.println("*****************************");

        // Deque INTERFACE - (LIFO - Stack)
        Deque<String> list = new ArrayDeque<>();
        list.add("A");
        list.add("B");
        System.out.println(list);
    }

    public void queArrayDeque() {
        System.out.println("*****************************");
        System.out.println("Using Queue - DequeArray.");
        System.out.println("*****************************");

        // Queue INTERFACE - (FIFO - Queue)
        Queue<String> list = new ArrayDeque<>();
        list.add("A");
        list.add("B");
        System.out.println(list);
    }
}
