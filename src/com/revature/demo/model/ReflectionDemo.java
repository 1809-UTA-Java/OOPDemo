package com.revature.demo.model;

import java.lang.reflect.Field;
import com.revature.demo.model.*;

/**
 * Reflection API is a way to investigate objects at runtime
 */
public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class d = Class.forName("com.revature.demo.model.Dog");
        Dog fido = (Dog) d.newInstance();
        fido.bark();

        Field[] fields = d.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        Field breed = d.getDeclaredField("breed");
        breed.setAccessible(true);
        breed.set(fido, "hello world");
        System.out.println(fido.toString());
    }

}