package com.wyett.classloaderdemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/2 15:37
 * @description: TODO
 */

public class ExtendClassloaderDemo {
    public static void main(String[] args) {
        String extendClassloaderPath = System.getProperty("java.ext.dirs");
        List<String> extendClassPath = Arrays.asList(extendClassloaderPath.split(";"));
        for (String path : extendClassPath) {
            System.out.println(path);
        }
    }
}

/**
D:\Program Files\Java\jdk1.8.0_231\jre\lib\ext
 C:\Windows\Sun\Java\lib\ext
 */

