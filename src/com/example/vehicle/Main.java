package com.example.vehicle;

import com.example.collections.MyCollections;
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

/*
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
*/

        // Calling MyCollections class
        MyCollections list1 = new MyCollections();
        list1.regularArray();

        MyCollections list2 = new MyCollections();
        list2.arrayList();

        MyCollections list3 = new MyCollections();
        list3.linkedList();

        MyCollections list4 = new MyCollections();
        list4.list();

        MyCollections list5 = new MyCollections();
        list5.deque();

        MyCollections list6 = new MyCollections();
        list6.queue();

        MyCollections list7 = new MyCollections();
        list7.deqArrayDeque();

        MyCollections list8 = new MyCollections();
        list8.queArrayDeque();
    }
}
