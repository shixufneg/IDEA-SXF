package com.neuedu.rubblishRecycling.entity;

public class Users {
    private String Name;
    private int PassWord;
    private int integral;
    private String chenghao;

    public String getChenghao() {
        return chenghao;
    }

    public void setChenghao(String chenghao) {
        this.chenghao = chenghao;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPassWord() {
        return PassWord;
    }

    public void setPassWord(int passWord) {
        PassWord = passWord;
    }
}

/**
 *  用户积分内部类
 */
//    class usersIntegral{
//        public usersIntegral(){}
//        public usersIntegral(int integral){
//            new Users().setIntegral(integral);
//        }
//}
