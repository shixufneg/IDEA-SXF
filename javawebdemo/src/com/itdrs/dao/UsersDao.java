package com.itdrs.dao;

import com.itdrs.pojo.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsersDao {
    //增
    public int insertByUsernameAndPassword(String username,String password){
        return 0;
    }
    //删
    //改
    //查
    //根据用户名查询一个用户
    public Users selectByUsersname(String username){
        Users u = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sxf_test";
            String user = "root";
            String passwprd = "sxf1314...";
            Connection connection = DriverManager.getConnection(url,user,passwprd);
            String sql = "SELECT * FROM users WHERE username=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                u = new Users();
                u.setId(resultSet.getInt("id"));
                u.setUsername(resultSet.getString("username"));
                u.setPassword(resultSet.getString("password"));
//            System.out.println("Users{"+"id="+resultSet.getInt("id")+
//            ",username=" + resultSet.getString("username") + '\''+
//            "password=" + resultSet.getString("password")+'\''
//            +'}');
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return u;
    }
}
