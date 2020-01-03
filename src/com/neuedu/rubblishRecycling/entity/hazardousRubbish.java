package com.neuedu.rubblishRecycling.entity;

/**
 *  有害垃圾
 */
public class hazardousRubbish extends rubbishObject {
    public hazardousRubbish(){
        String name = "有害垃圾";
        int type = 2;
        int hurt = 2;
        this.setHurt(hurt);
        this.setName(name);
        this.setType(type);
    }
    @Override
    void hurts() {

    }
}
