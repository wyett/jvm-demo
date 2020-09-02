package com.wyett.compare;

import java.lang.reflect.Field;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/2 10:18
 * @description: TODO
 */

public class IntegerPlusSample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Class cache = Integer.class.getDeclaredClasses()[0]; //1
        Field myCache = cache.getDeclaredField("cache"); //2
        myCache.setAccessible(true);//3

        Integer[] newCache = (Integer[]) myCache.get(cache); //4
        newCache[132] = newCache[133]; //5

        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //
    }
}
