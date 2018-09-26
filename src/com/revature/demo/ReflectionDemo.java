package com.revature.demo;

import java.lang.reflect.Field;

/**
* Reflection API is a way to investigate objects at runtime
* can be invasive; reflection can get around protected/private states
* broke rules set in encapsulation 
* basically there are ways to mess w flow and rules of program at runtime
* nothing created in objects r set in stone
* Spring is based off reflection API 
*/

public class ReflectionDemo throws Exception{
    public static void main(String args()) {
        //Class<?> is a generic argument 
        Class<?> dog = Class.forName("Dog");
        //the below statement is basically saying: at runtime, give me a dog object
        Dog fido = (Dog) dog.newInstance();
        System.out.println(dog.getName());
    }

}