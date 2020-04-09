package com.wyett.classloaderdemo;

import java.util.Random;

/**
 * @author : wyettLei
 * @date : Created in 2020/4/9 12:35
 * @description: 对于final字段，在编译期不能确定，是一个引用，相当于一个变量；因此只会初始化定义了这个变量的类；
 */

public class InvokeParentField2 {
    public static void main(String[] args) {
        System.out.println("================>" + Son_2.num);
    }
}

class Parent_2 {
    public static final int num = new Random().nextInt();
    static {
        System.out.println("=================2");
    }
}

class Son_2 extends  Parent_2 {
    static {
        System.out.println("==================3");
    }
}
