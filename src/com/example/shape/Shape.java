package com.example.shape;

public abstract class Shape {

    public abstract double getArea();

    public void draw() { // CONCRETE - it is inherited
        System.out.println("Shape draw");
    }

}
