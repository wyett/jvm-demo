package com.wyett.myclassloadertest;

import com.wyett.myclassloader.WyettClassloader;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/2 23:26
 * @description: TODO
 */

public class WyettClassloaderTest {
    //sun.misc.Launcher$AppClassLoader@18b4aac2
    @Test
    public void loadingClassPathClass() throws ClassNotFoundException {
        // 自定义的类加载器
        WyettClassloader wyettClassloader = new WyettClassloader("wuett");
        // 通过自定义类加载器加载class
        Class<?> clazz = wyettClassloader.loadClass("com.wyett.myclass.Dog");
        // 原因：因为我们的自定义加载器是符合双亲委派模型的,
        // 由于自定义的类加载器的父亲是系统类加载器，
        // 而我们系统类加载器可以自己加载我们classpath的class.
        // 输出结果是AppClassLoader
        System.out.println(clazz.getClassLoader());
    }

    //sun.misc.Launcher$AppClassLoader@18b4aac2
    @Test
    public void loadCustomPathClass() throws ClassNotFoundException {
        WyettClassloader wyettClassloader = new WyettClassloader("wyett");
        wyettClassloader.setLoadPath("E:\\mycode\\mygit\\jvm-demo");
        Class<?> clazz = wyettClassloader.loadClass("com.wyett.myclass.Dog");
        System.out.println(clazz.getClassLoader());
    }

    @Test
    public void loadCustomPathClass2() throws ClassNotFoundException {
        WyettClassloader wyettClassloader = new WyettClassloader("wyett");
        wyettClassloader.setLoadPath("E:\\mycode\\mygit\\jvm-demo");
        Class<?> clazz = wyettClassloader.loadClass("com.wyett.myclass.Person");
        System.out.println(clazz.getClassLoader());
    }







    @Test
    public void loaingTheSameClassByDiffLoadingClass() throws ClassNotFoundException, IllegalAccessException,
            InstantiationException {

        WyettClassloader wyettClassloader = new WyettClassloader("wyett");
        wyettClassloader.setLoadPath("D:\\mycode\\mygit\\jvm-demo");
        //通过我们自定义的类加载器来加载class
        Class<?> clazz = wyettClassloader.loadClass("com.wyett.myclass.Person");
        System.out.println("clazz是由我们的:" + clazz.getClassLoader() + "加载的,clazz对象的hashcode:" +
                clazz.hashCode());

        WyettClassloader wyettClassloader1 = new WyettClassloader("wyett2");
        //通过我们自定义的类加载器来加载class
        wyettClassloader1.setLoadPath("D:\\mycode\\mygit\\jvm-demo");
        Class<?> clazz1 = wyettClassloader1.loadClass("com.wyett.myclass.Person");
        System.out.println("clazz1是由我们的:" + clazz1.getClassLoader() + "加载的,clazz1对象的hashcode:" +
                clazz1.hashCode());
    }

    @Test
    public void loaingTheSameClassByDiffLoadingClass2() throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {

        WyettClassloader wyettClassloader = new WyettClassloader("wyett");
        wyettClassloader.setLoadPath("D:\\mycode\\mygit\\jvm-demo");
        //通过我们自定义的类加载器来加载class
        Class<?> clazz = wyettClassloader.loadClass("com.wyett.myclass.Person");

        Object obj1 = clazz.newInstance();


        WyettClassloader wyettClassloader1 = new WyettClassloader("wyett2");
        //通过我们自定义的类加载器来加载class
        wyettClassloader1.setLoadPath("D:\\mycode\\mygit\\jvm-demo");
        Class<?> clazz1 = wyettClassloader1.loadClass("com.wyett.myclass.Person");

        Object obj2 = clazz1.newInstance();

        Method method = clazz.getMethod("setTheSomeClassLoadedByDiffCLassLoader",Object.class);

        method.invoke(obj1,obj2);

    }
}

