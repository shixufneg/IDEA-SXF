package com.itdrs;
import java.sql.*;
public class JDBCDemo2 {

    public static void main(String[] args) {
        try {

            //2.创建连接
            String url = "jdbc:mysql://localhost:3306/sxf_test";
            String users = "root";
            String password = "sxf1314...";
            Connection con=DriverManager.getConnection(url,users,password);
            //3.创建对象
            Statement st=con.createStatement();
            //4.执行SQL语句
            String sql="SELECT * FROM student WHERE s_id='01'";
            ResultSet rs=st.executeQuery(sql);
            //5.处理结果
            while (rs.next()){
                System.out.println(rs.getString("s_id")+"： "+rs.getString("s_name")
                        +"   "+rs.getString("s_birth")+"   "+rs.getString("s_sex"));
            }
            //6.关闭连接
            rs.close();
            st.close();;
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
