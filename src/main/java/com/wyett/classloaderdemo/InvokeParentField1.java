package com.wyett.classloaderdemo;

/**
 * @author : wyettLei
 * @date : Created in 2020/4/9 12:29
 * @description: 对于final字段而言，类调用final字段，在编译阶段就完成了
 */

public class InvokeParentField1 {
    public static void main(String[] args) {
        System.out.println("===========>" + Son_1.num);
    }
}

class Parent_1 {
    public static final int num = 1;
    static {
        System.out.println("==================2");
    }
}

class Son_1 extends Parent_1 {
    static {
        System.out.println("=================3");
    }
}
