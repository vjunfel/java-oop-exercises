package com.myapp.lambda;

import java.util.List;

public class MyLambda {
    public void myLambda() {
        System.out.println("*****************************");
        System.out.println("Using Lambda.");
        System.out.println("*****************************");

        // Using regular object initialization
//        MyInterface lambda1 = new MyInterface() {
//            @Override
//            public void greet(String name, int age) {
//                System.out.printf(
//                        "Hello %s! Your age is %d.\n",
//                        name, age
//                );
//            }
//        };
//        lambda1.greet("John", 21);

        // Using lambda function - Abstract method
        MyInterface lambda1 = (name, age) ->
                System.out.printf(
                        "Hello %s! Your age is %d.\n",
                        name, age
                );

        lambda1.greet("Mark", 22);

        // Using Default method with method overloading
        lambda1.greet("James", 23, "Cebu");

        System.out.println();

        var result = lambda1.add(2, 4, 3);
        System.out.println("Result: " + result);

        // ------------------------------------------------
        List<String> names = List.of("John", "Jane", "Jack");

        // Convert all names to uppercase
        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        System.out.println(upperNames); // [JOHN, JANE, JACK]
    }
}
