package com.revature.demo.model;

/**
*
* Interfaces, like abstract classes, force whatever
* implements them to define its methods it inherits.
* Most every method in an interface is abstract
* Great way to enforce certain behavior in a class
*
* If an interface has no methods, it is probably a MARKER INTERFACE
* examples: Serializable, Clonable
* advantages: used by a compiler as a flag; ie tells compiler it has 
* a serializer id to flag it
*
* If an interface has one and only one method, it is probably a
* FUNCTIONAL INTERFACE
* examples: Runnable
* advantages: 
*
* Interfaces are great as contracts between programmers  
*/

public interface Barkable {
    public void bark();


}