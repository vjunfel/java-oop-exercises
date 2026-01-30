package com.example.vehicle;

import com.example.shape.MyInterface;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ferrari", "blue", 2025, 4);
//        car1.move();

//        System.out.println(car1.name);
//        System.out.println(car1.model);
//        System.out.println(car1.color);
//        car1.showWheels();
//
//        System.out.println("Inactive: "+ car1.isActive());
//        car1.setActive(true);
//        System.out.println("Active: " + car1.isActive());

//        Car car2 = new Car("Hilux");
//        car2.stop();


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
        lambda2.greet("Junfel", 23);

    }
}
