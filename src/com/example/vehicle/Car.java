package com.example.vehicle;

public class Car extends Vehicle {
    private boolean isActive = false;

//    METHOD OVERLOADING
    public Car(String name) {
        super(name);
        this.name = name;
    }

    public Car(String name, String color, int model, int wheels) {
        super(name, model, color);
        this.wheels = wheels;
    }

    void showWheels() {
        System.out.println("wheels: " + wheels);
    }

    public boolean isActive(){
        return isActive;
    }

    public void setActive(boolean active){
        isActive = active;
    }
}
