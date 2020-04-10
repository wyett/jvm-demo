package com.wyett.spi;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/4 12:06
 * @description: TODO
 */

public class SPIServiceLoader {
    public static void main(String[] args) {
        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = serviceLoader.iterator();

        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("driver的类型" + driver.getClass() + "和类加载器" + driver.getClass().getClassLoader());
        }

        System.out.println("ServiceLoader的类加载器" + serviceLoader.getClass().getClassLoader());
        System.out.println("线程上下文类加载器" + Thread.currentThread().getContextClassLoader());

    }
}
