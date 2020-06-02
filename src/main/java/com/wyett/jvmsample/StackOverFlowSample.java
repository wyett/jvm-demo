package com.wyett.jvmsample;

/**
 * @author : wyettLei
 * @date : Created in 2020/6/2 17:36
 * @description: TODO
 * -Xms2048M -Xmx20480M -Xmn1024M -Xss512K -XX:MetaspaceSize=256M -XX:MaxMetaSpaceSize=256M
 */

public class StackOverFlowSample {

    private static int count;
    public static void run() {
        count++;
        run();
    }

    public static void main(String[] args) {
        try {
            run();
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("run func " + count);
        }
    }
}
