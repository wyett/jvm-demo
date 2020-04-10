package com.wyett.allentrust;

import com.wyett.myclass.Dog;
import com.wyett.myclassloader.WyettClassloader;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/4 0:20
 * @description: TODO
 */

public class TestClassLoaderNameSpace {
    public static void main(String[] args) throws ClassNotFoundException {
        WyettClassloader wyettClassloader = new WyettClassloader("wyett");
        wyettClassloader.setLoadPath("E:\\mycode\\mygit\\jvm-demo\\");
        Class<?> clazz = wyettClassloader.loadClass("com.wyett.allentrust.NewPerson");
        System.out.println("NewPerson使用" + clazz.getClassLoader() + "加载");
        System.out.println("NewDog使用" + Dog.class.getClassLoader() + "加载");
    }
}
