package com.wyett.spi;

import com.mysql.cj.jdbc.NonRegisteringDriver;

import java.sql.SQLException;

/**
 * @author : wyettLei
 * @date : Created in 2020/3/4 15:17
 * @description: TODO
 */

public class Driver extends NonRegisteringDriver implements java.sql.Driver {
    static {
        try {
            java.sql.DriverManager.registerDriver((new Driver()));
        } catch (SQLException e) {
            throw new RuntimeException("Con't register driver");
        }
    }

    public Driver() throws SQLException {
    }
}
