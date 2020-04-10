package com.wyett.classloaderdemo;

/**
 * @author : wyettLei
 * @date : Created in 2020/4/10 14:57
 * @description: 对类的首次初始化，会初始化父类，但不会实例化接口
 */

public class InvokeClassNotInitInterface {
    public static void main(String[] args) {
        System.out.println("=============>" + Son_3.num);
    }
}

interface Parent_3 {
    Demo demo = new Demo();
}

class Son_3 implements Parent_3 {
    public static int num = 1;
}



class Demo {
    public Demo() {
        System.out.println("==========>2");
    }
}
