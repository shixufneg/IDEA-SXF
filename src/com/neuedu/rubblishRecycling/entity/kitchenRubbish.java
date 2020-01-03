package com.neuedu.rubblishRecycling.entity;

/**
 *  厨房垃圾类
 */
public class kitchenRubbish extends rubbishObject {
    public kitchenRubbish(){
        String name = "厨房垃圾";
        int type = 0;
        int hurt = 0;
        this.setHurt(hurt);
        this.setName(name);
        this.setType(type);
    }
    @Override
    void hurts() {

    }
}
