package com.neuedu.rubblishRecycling.entity;

/**
 *  所有垃圾桶的父类
 */
abstract class trashcanObject {
    private String name;
    private int type;
    private int capacity;//容量

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //回收垃圾的方法
    abstract void recycleRubbish();
}
