package com.itdrs.services;

import com.itdrs.dao.UsersDao;
import com.itdrs.pojo.Users;

public class UsersServicesImpl implements UsersServices{
    UsersDao usersDao = new UsersDao();
    @Override
    public int register(String usersname, String password) {
        if(usersname == null || usersname.equals("")){
            return 0;
        }
        if(password == null || password.equals("")){
            return 0;
        }
        //用户名是否存在
        Users users = usersDao.selectByUsersname(usersname);
        if(users != null){
            return 0;
        }
        //用户名不存在才保存
        return 0;
    }
}
