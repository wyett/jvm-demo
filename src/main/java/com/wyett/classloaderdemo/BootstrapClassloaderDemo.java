package com.wyett.classloaderdemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/2 13:06
 * @description: TODO
 */

public class BootstrapClassloaderDemo {
    public static void main(String[] args) {
        String bootstrapClassloaderPath = System.getProperty("sun.boot.class.path");
        List<String> bootstrapPathList = Arrays.asList(bootstrapClassloaderPath.split(";"));
        for (String bootstrapPath : bootstrapPathList) {
            System.out.println(bootstrapPath);
        }
    }
}
