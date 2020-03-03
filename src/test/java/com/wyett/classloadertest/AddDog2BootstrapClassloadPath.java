package com.wyett.classloadertest;


import com.wyett.myclass.Dog;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/2 15:10
 * @description: TODO
 */

public class AddDog2BootstrapClassloadPath {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        System.out.println("加载自己的class: " + Dog.class.getClassLoader());
    }
}
