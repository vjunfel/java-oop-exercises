package com.myapp.lambda;

@FunctionalInterface
public interface MyInterface {

    // ONE abstract method only, implicit abstract.
    void greet(String name, int age);

    // Default method - method overloading.
    default void greet(String name, int age, String location) {
        System.out.printf(
                "Name: %s, Age:  %d, %s: ",
                name, age, location
        );
    }

    default int add(int a, int b, int c) {
        return a + b + c;
    }
}
