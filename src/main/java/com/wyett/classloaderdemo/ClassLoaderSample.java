package com.wyett.classloaderdemo;

import com.sun.java.accessibility.AccessBridge;

/**
 * @author : wyettLei
 * @date : Created in 2020/6/2 16:21
 * @description: TODO
 */

public class ClassLoaderSample {
    public static void main(String[] args) {
        //System.out.println(String.class.getClassLoader().getClass().getName());
        System.out.println(String.class.getClassLoader());
        System.out.println("=========");
        System.out.println(AccessBridge.class.getClassLoader());
        System.out.println(AccessBridge.class.getClassLoader().getClass());
        System.out.println(AccessBridge.class.getClassLoader().getClass().getName());
        System.out.println("=========");
        System.out.println(ClassLoaderSample.class.getClassLoader().getClass().getName());
        System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());

    }
}
