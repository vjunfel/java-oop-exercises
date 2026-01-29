package com.example.vehicle;

public class Bike extends Vehicle{
    int wheels = 4;

    public Bike(String name, String color, int model, int wheels) {
        super(name, model, color);
        this.wheels = wheels;

    }
}
