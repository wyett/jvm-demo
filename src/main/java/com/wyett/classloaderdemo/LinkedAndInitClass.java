package com.wyett.classloaderdemo;

/**
 * @author : wyettLei
 * @date : Created in 2020/4/10 16:13
 * @description: TODO
 */

public class LinkedAndInitClass {
    public static void main(String[] args) {
        // 1.对Singleton的首次初使用触发了初始化，但初始化需要先进行 加载，链接
        // 6.初始化完成后，再打印 1, 0
        System.out.println("===========" + Singleton.numA);
        System.out.println("===========" + Singleton.numB);
    }
}

class Singleton {
    // 2.1.链接准备阶段，为numA赋默认值为0
    // 3.1.初始化阶段，为numA赋正确的值为0
    public static int numA = 0;

    // 2.2.链接准备阶段，为singleton赋默认值null
    // 3.2.初始化阶段，为singleton赋正确的值，所以需要new Singleton(), 标记为4阶段
    public static Singleton singleton = new Singleton();

    private Singleton() {
        // 4.1 new阶段 numA++ 0 -> 1
        numA++;
        // 4.2 new阶段 numB++ 0 -> 1
        numB++;
        // 4.3 打印
        System.out.println(numA);
        System.out.println(numB);
    }

    // 2.3.链接准备阶段，为numB赋默认值为0
    // 5.1.初始化阶段，为numB赋正确的值，所以1 -> 0
    public static int numB = 0;

    public static Singleton getSingleton() {
        return singleton;
    }
}
