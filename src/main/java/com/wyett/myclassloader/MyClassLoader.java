package com.wyett.myclassloader;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2020/6/2 16:45
 * @description: TODO
 */

public class MyClassLoader extends ClassLoader {

    public String classPath;

    public MyClassLoader(String classPath) {
        this.classPath = classPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        return super.findClass(name);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    /**
     * readfile
     * @param name
     * @return
     * @throws IOException
     */
    public byte[] loadBytes(String name) throws IOException {
        name = name.replaceAll("\\.", "/");
        FileInputStream inputStream = new FileInputStream(classPath + name + ".class");
        int size = inputStream.available();
        byte[] data = new byte[size];
        inputStream.read(data);
        inputStream.close();

        return data;
    }


}
