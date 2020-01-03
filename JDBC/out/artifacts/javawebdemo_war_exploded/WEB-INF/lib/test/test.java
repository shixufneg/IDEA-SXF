import com.itdrs.JDBCUtil2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws SQLException, IOException {
        Properties p = new Properties();
        InputStream in = test.class.getClassLoader().getResourceAsStream("db.properties");
        //加载流
        p.load(in);
        //读取属性
        String driverClass = p.getProperty("driverClass");

        //2
        try {
            Connection con = JDBCUtil2.getCon();
            //3.创建对象
            String sql = "SELECT * FROM student WHERE s_id= 01";
            PreparedStatement statement = con.prepareStatement("sql");
            //4.执行sql语句
            ResultSet resultSet = statement.executeQuery(sql);
            //5.处理结果集
            while(resultSet.next()){
                System.out.println(resultSet.getInt("s_id")+"   "+ resultSet.getString("s_name"));
            }
            //6.关闭资源
            JDBCUtil2.closeAll(con,statement,resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
