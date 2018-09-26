package com.revature.demo.model;

public class Dog extends Pet {
    public Dog (byte legs, boolean hasFur, String color) {
        super(legs, hasFur, color);
    }

    public void eats() {System.out.print("Munch munch");}

    public void bark() {
        System.out.println("woof");
    }
}