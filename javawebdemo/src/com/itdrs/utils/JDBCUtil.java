package com.itdrs.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    static String driverClass;
    static String url ;
    static String user;
    static String password;
    static{
        Properties p = new Properties();
        InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            p.load(in);
            driverClass = p.getProperty("driverClass");
            url = p.getProperty("url");
            user = p.getProperty("user");
            password = p.getProperty("password");
            Class.forName(p.getProperty("driverClass"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static Connection getCon(String url,String user,String password) throws SQLException {
        Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }
}
