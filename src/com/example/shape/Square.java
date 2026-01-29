package com.example.shape;

public class Square extends Shape {
    double length;
    double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
