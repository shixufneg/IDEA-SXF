package com.neuedu.rubblishRecycling.entity;

/**
 *  所有垃圾的父类
 */
abstract class rubbishObject {
    private String name;
    private int type;
    private int hurt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
    abstract void hurts();
}
