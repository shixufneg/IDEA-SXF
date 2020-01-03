package com.neuedu.rubblishRecycling.entity;

/**
 *  可回收垃圾桶
 */
public class recoverableTrashcan extends trashcanObject{
    public recoverableTrashcan(){
        String name = "可回收垃圾桶";
        int type = 1;
        int capacity = 5;//容量
        this.setName(name);
        this.setType(type);
        this.setCapacity(capacity);
    }
    //回收垃圾的方法
    @Override
    void recycleRubbish() {

    }
}
