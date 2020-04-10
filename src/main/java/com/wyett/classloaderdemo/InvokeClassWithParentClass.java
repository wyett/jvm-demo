package com.wyett.classloaderdemo;

/**
 * @author : wyettLei
 * @date : Created in 2020/4/10 15:03
 * @description: TODO
 */

public class InvokeClassWithParentClass {
    public static void main(String[] args) {
        System.out.println("=========>" + Son_4.num);
    }
}

class Parent_4 {
    Demo1 demo1 = new Demo1();
}

class Son_4 extends Parent_4{
    public static int num = 1;
}

class Demo1 {
    public Demo1() {
        System.out.println("==========>2");
    }
}