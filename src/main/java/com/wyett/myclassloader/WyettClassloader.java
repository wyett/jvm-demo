package com.wyett.myclassloader;

import java.io.*;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/2 23:25
 * @description: TODO
 */

public class WyettClassloader extends ClassLoader {
    //后缀
    private static final String FILE_SUFFIX = ".class";

    //
    private String classLoaderName;

    //
    private String loadPath;

    public String getLoadPath() {
        return loadPath;
    }

    public WyettClassloader(ClassLoader parentClassLoader, String classLoaderName) {
        super(parentClassLoader);
        this.classLoaderName = classLoaderName;
    }

    public WyettClassloader(String classLoaderName) {
        this.classLoaderName = classLoaderName;
    }

    /**
     * 创建class的二进制名称
     * @param name
     * @return
     */
    private byte[] loadClassData(String name) {
        byte[] data = null;
        ByteArrayOutputStream  baos = null;
        InputStream is = null;

        try {
            name = name.replaceAll(".", "\\");
            String fileName = loadPath + name + FILE_SUFFIX;
            File file = new File(fileName);
            is = new FileInputStream(file);

            baos = new ByteArrayOutputStream();
            int ch;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }

            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(baos != null) {
                    baos.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        return data;

    }

    protected Class<?> findClass(String name) {
        byte[] data = loadClassData(name);
        return defineClass(name, data, 0, data.length);
    }


}
