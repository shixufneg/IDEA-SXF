package com.itdrs;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil2 {
    static String driverClass;
    static String url;
    static String user;
    static String password;
    static{
        Properties p = new Properties();
        InputStream in = JDBCUtil2.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            //加载流
            p.load(in);
            driverClass = p.getProperty("driverClass");
            url = p.getProperty("url");
            user = p.getProperty("username");
            password = p.getProperty("password");
            Class.forName(driverClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public JDBCUtil2(){}
    // 1.对外提供连接对象
    public static Connection getCon() throws SQLException {
        Connection con = DriverManager.getConnection(url, user, password);
        return con;
    }
    //2.关闭资源
    public static void closeAll(Connection con, Statement st, ResultSet rs){
        closeResultSet(rs);
        closeStamement(st);
        closeConection(con);
    }
    //3.增删改关闭资源
    public static void closeAll(Connection con, Statement st){
        closeStamement(st);
        closeConection(con);
    }

    private static void closeConection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private static void closeStamement(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private static void closeResultSet(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
