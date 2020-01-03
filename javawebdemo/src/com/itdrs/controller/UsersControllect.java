package com.itdrs.controller;

import com.itdrs.services.UsersServices;
import com.itdrs.services.UsersServicesImpl;

public class UsersControllect {
    UsersServices us = new UsersServicesImpl();
    public int register(String username,String password){
        int register = us.register(username, password);
        return register;
    }
}
