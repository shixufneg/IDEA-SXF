package com.itdrs;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JBDCUtil {
    static{
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // 1.对外提供连接对象
    public static Connection getCon(String url, String root, String password) throws SQLException {
        Connection con = DriverManager.getConnection(url, root, password);
        return con;
    }
    //2.关闭资源
    public static void closeAll(Connection con, Statement st, ResultSet rs) throws SQLException {
        rs.close();
        st.close();
        con.close();
    }
}
