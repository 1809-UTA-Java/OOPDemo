package com.revature.demo;

public class Test {
    public static void main(String args()) {
        //object polymorphism. pet can reference a dog since they r related 
        //can't do fido.bark() because there is no bark method in Pet
        //since Pet -> Dog
        //and dog is the one that implements barkable
        //if u change it so that pet implements barkable, and optionally
        //remvoe the barkable interface from Dog, then u can do fido.bark()
        //java autocast 4 as an int, so have to cast (byte) 
        //
        //doing pet implements barkable
        //means that any class that extends pets has to implement 
        //any abstract method in pet and barkable
        Pet fido = new Dog((byte)4, true, "blue");

    }

}