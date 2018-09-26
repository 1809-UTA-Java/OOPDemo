package com.revature.demo.model;

/**
 * This is an abstract class, which means it can have
 * both abstract (unimplemented) methods, as well as
 * concrete methods
 *  
 */
public abstract class Pet implements Barkable{
    protected byte legs;
    protected boolean hasFur;
    protected String color;

    public Pet (byte legs, boolean hasFur, String color) {
        this.legs = legs;
        this.hasFur = hasFur;
        this.color = color;
    }

    public Pet() {

    }

    public abstract void eats();
}