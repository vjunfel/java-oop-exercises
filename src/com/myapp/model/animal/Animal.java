package com.myapp.model.animal;

public class Animal {
    boolean isAlive;
    String name;
    int age;
//    String species;

    Animal(String name, int age) {
        isAlive = true;
        this.name = name;
        this.age = age;
    }

    void move() {
        System.out.println("The " + this.name + " is running.");
    }
}
