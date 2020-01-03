package com.itdrs;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class JDBCDemo {

    public static void main(String[] args) {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;

        try {
            //1.注册驱动
            DriverManager.registerDriver(new Driver());
            //2.创建连接
                con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sxf_test",
                        "root",
                        "sxf1314...");
            //3.创建对象
            st=con.createStatement();
            //4.执行SQL
            String sql="SELECT * FROM student WHERE s_id='01'";
            rs=st.executeQuery(sql);
            //5.处理结果
            while (rs.next()){
                System.out.println(rs.getString("s_id")+".........."+rs.getString("s_name")
                        +"....."+rs.getString("s_birth")+"....."+rs.getString("s_sex"));
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
