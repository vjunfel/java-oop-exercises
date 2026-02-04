package com.myapp.collections;

import java.util.List;


public class MyStreams {

    public void myStreams() {
        System.out.println("*****************************");
        System.out.println("Using Streams.");
        System.out.println("*****************************");

//        List<String> list = new ArrayList<>();
//        list.add("John");
//        list.add("Ana");
//        list.add("Mary");

        List<String> list = List.of("John", "Ana", "Mary");

        List<String> result = list.stream()
                .filter(name -> !name.equals("Ana"))
                .toList(); // Java 16+
//              .collect(Collectors.toList()); // Java 15 and below

        System.out.println(result);
    }
}
