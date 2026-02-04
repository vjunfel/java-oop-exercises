package com.myapp.vehicle;

public abstract class Vehicle {
    String name;
    String color;
    int model;
    int wheels = 4;

    //    CONSTRUCTOR OVERLOADING
    public Vehicle(String name) {
        this.name = name;
        System.out.println("New Vehicle (" + this.name + ") is created!");
    }

    public Vehicle(String name, int model, String color) {
//        this(name);
        this.name = name;
        this.color = color;
        this.model = model;
        System.out.printf("New Vehicle (%s, %s, %s) created! \n", name, model, color);
    }

    public void move() {
        System.out.printf("The %s is moving \n", this.name);
    }

    void stop() {
        System.out.printf("The %s is stopping \n", this.name);
    }
}
