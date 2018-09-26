package com.revature.demo;

import com.revature.demo.model.Dog;
import com.revature.demo.model.Pet;

public class Test {
    public static void main(String[] args) {
        Pet fido = new Dog((byte) 4, true, "blue");
        fido.bark();
    }
}