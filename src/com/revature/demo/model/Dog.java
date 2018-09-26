package com.revature.demo.model;

//extends class Pet and uses interface Barkable
//for multiple interfaces
// ... implements Barkable, Cloneable,...; 
public class Dog extends Pet implements Barkable {
    //dog does not inherit pet's constructor 
    public Dog (byte legs, boolean hasFur, String color) {
        //super is a reference to the parent class;
        //so u can call the constructor
        super(legs, hasFur, color);
    }

    //method overriding from class Pet
    public void eats() {
        System.out.print("munch munch");

    }

    //method from interface 
    public void bark() {
        System.out.println("woof");
    }


    
}