package com.wyett.jvmmemorymodel02;

import java.util.ArrayList;

/**
 * @author : wyettLei
 * @date : Created in 2020/6/15 18:43
 * @description: TODO
 */

public class HeapTest {

    byte[] a = new byte[1024 * 100]; //100kb

    public static void main(String[] args) throws InterruptedException {
        ArrayList<HeapTest> htlist = new ArrayList<HeapTest>();
        while(true) {
            htlist.add(new HeapTest());
            Thread.sleep(10);
        }
    }
}
