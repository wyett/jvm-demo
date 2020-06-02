package com.wyett.spi;

import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/4 17:28
 * @description: TODO
 */

public class DriverManager {
    static {
        loadInitialDrivers();
        System.out.println("JDBC DriverManager initialized");
    }

    private static void loadInitialDrivers() {
        String drivers;

        try {
            drivers = AccessController.doPrivileged(new PrivilegedAction<String>() {
                @Override
                public String run() {
                    return System.getProperty("jdbc.drivers");
                }
            });
        } catch (Exception e) {
            drivers = null;
        }
    }

    /*AccessController.doPrivileged(new PrivilegedAction(Void)) {

    }*/
}
