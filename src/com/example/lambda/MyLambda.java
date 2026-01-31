package com.example.lambda;

public class MyLambda {
    public void myLambda() {
        System.out.println("*****************************");
        System.out.println("Using Lambda.");
        System.out.println("*****************************");

        // Using regular object initialization
        MyInterface lambda1 = new MyInterface() {
            @Override
            public void greet(String name, int age) {
                System.out.printf("Hello %s! Your age is %d.\n", name, age);
                ;
            }
        };
        lambda1.greet("Jun", 23);


        // Using lambda function
        MyInterface lambda2 = (name, age) -> System.out.printf("Hello %s! Your age is %d.\n", name, age);
        lambda2.greet("Jun", 23);
    }
}
