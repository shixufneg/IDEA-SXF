import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource m = new ComboPooledDataSource();
        Connection connection = m.getConnection();
        String sql = "select * from student";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            int anInt = resultSet.getInt(1);
            int s_id = resultSet.getInt("s_id");
            String s = resultSet.getString("s_name");
            System.out.println("i"+anInt+"name:"+s);
            System.out.println(s_id);
        }
    }
}
