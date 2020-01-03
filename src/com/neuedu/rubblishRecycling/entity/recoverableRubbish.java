package com.neuedu.rubblishRecycling.entity;

/**
 * 可回收垃圾
 */
public class recoverableRubbish extends rubbishObject {
    public recoverableRubbish(){
        String name = "可回收垃圾";
        int type = 1;
        int hurt = 1;
        this.setHurt(hurt);
        this.setName(name);
        this.setType(type);
    }
    @Override
    void hurts() {

    }
}
