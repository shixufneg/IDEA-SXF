package com.neuedu.rubblishRecycling.service;

import com.neuedu.rubblishRecycling.dao.UserDao;
import com.neuedu.rubblishRecycling.entity.Users;

public class UserService {
    private UserDao ud = new UserDao();
    //查看当前用户是否已经注册
    public String register(String name,int passWord){
        Users users = ud.comparisonName(name);
        if(users != null){
            return "用户已经存在，请重新输入";
        }
        //注册
        Users u = new Users();
        u.setName(name);
        u.setPassWord(passWord);
        int i = ud.addOne(u);
        if(i <= 0){
            return "用户注册失败";
        }
        return "用户注册成功";
    }
    //登陆
    public String login(String name , int psd){
        Users users = ud.comparisonLoginUsrer(name,psd);
        if(users != null){
            System.out.println("登陆成功");
        }else{
           return  "登陆失败!请重新输入";
        }
        return "-----------------";
    }
}
