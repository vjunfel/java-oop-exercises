package com.living.animal;

public class Dog extends Animal {
    String species;

    Dog(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }
}