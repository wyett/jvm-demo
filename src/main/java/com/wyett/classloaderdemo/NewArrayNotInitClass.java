package com.wyett.classloaderdemo;

/**
 * @author : wyettLei
 * @date : Created in 2020/4/10 15:38
 * @description: objects for array classes are not created by class
 *  * loaders, but are created automatically as required by the Java runtime
 */

public class NewArrayNotInitClass {
    public static void main(String[] args) {
        Person[] person = new Person[4];
    }
}

class Person {
    static {
        System.out.println("Person static code");
    }
}
