package com.example.vehicle;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ferrari", "blue", 2025, 4);
        car1.move();

//        System.out.println(car1.name);
//        System.out.println(car1.model);
//        System.out.println(car1.color);
//        car1.showWheels();
//
//        System.out.println("Inactive: "+ car1.isActive());
//        car1.setActive(true);
//        System.out.println("Active: " + car1.isActive());

        Car car2 = new Car("Hilux");
        car2.stop();
    }
}
