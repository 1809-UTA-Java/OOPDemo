package com.revature.demo.model;

public class Dog extends Pet {
    private String breed = "Retriever";

    public Dog (byte legs, boolean hasFur, String color) {
        super(legs, hasFur, color);
    }

    public Dog() {}

    public void eats() {System.out.print("Munch munch");}

    public void bark() {
        System.out.println("woof");
    }

    public String toString() {
        return breed;
    }
}