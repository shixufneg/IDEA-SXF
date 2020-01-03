package com.neuedu.rubblishRecycling.contreller;


import com.neuedu.rubblishRecycling.service.UserService;

public class UserContreller {
    UserService us = new UserService();
    public String register(String name,int psd){
        String register = us.register(name, psd);
        return register;
    }
    public String login(String name,int psd){
        String login = us.login(name, psd);
        return login;
    }

}
