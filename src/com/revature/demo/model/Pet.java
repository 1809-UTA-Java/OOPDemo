package com.revature.demo.model;

/**
* lots of similarities between an abstract class and an interface
* an abstract class can have both abstract (unimplemented) methods
* as well as concrete (implemented) methods.
* interfaces only have unimplemented methods 
* and regular classes have implemmented methods 
*
 */

public abstract class Pet {
    
    protected byte legs;
    protected boolean hasFur;
    protected String color;

    /* CONSTRUCTOR */
    public Pet (byte legs, boolean hasFur, String color) {
        //'this' referring to the field protected byte legs
        // local scope legs takes precedent to class scope legs
        
        this.legs = legs;
        this.hasFur = hasFur;
        this.color = color;

    }

    //empty constructor 
    public Pet() {


    }

    //don't need curly braces if method has no implementation 
    public abstract void eats();



}