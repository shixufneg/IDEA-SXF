package com.neuedu.rubblishRecycling.dao;


import com.neuedu.rubblishRecycling.entity.Users;

public class UserDao {
    private static Users[] users;
    static{
        users = new Users[10];
    }
    //在数组中查找用户是否存在
    public Users comparisonName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                //用户名作比较
                if(users[i].getName().equals(name)){
                    return users[i];
                }
            }
        }
        return null;
    }
    //新用户放到数组里注册
    public int addOne(Users u){
        for (int i = 0; i < users.length; i++) {
            if(users[i] == null){
                users[i] = u;
                return 1;
            }
        }
        return -1;
    }
    //登陆
    public Users comparisonLoginUsrer(String  name,int psd){
        for (int i = 0; i <users.length ; i++) {
            if(users[i] != null){
                if(users[i].getName().equals(name) && users[i].getPassWord() == psd ){
                    return users[i];
                }
            }
        }
        return null;
    }
}
