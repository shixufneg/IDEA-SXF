package com.itdrs.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil2 {
    public static Connection getCon2() throws SQLException {
        ComboPooledDataSource cd = new ComboPooledDataSource();
        Connection connection = cd.getConnection();
        return connection;
    }
}
