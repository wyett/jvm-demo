package com.wyett.classloaderdemo;

/**
 * @author : wyettLei
 * @date : Created in 2020/4/9 12:20
 * @description: 对于静态字段而言，我们类在首次使用的时候，只会去初始化定义这个静态字段的类；
 *          即使是通过Son去引用的，但字段是父类的，只会去初始化父类；
 */

public class InvokeParentField {
    public static void main(String[] args) {
        System.out.println("================>" + Son.num);
    }
}

class Parent {
    public static int num = 1;
    static {
        System.out.println("=================>2");
    }
}

class Son extends Parent {
    static {
        System.out.println("===================>3");
    }
}
