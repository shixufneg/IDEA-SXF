package com.neuedu.rubblishRecycling.entity;

/**
 *  有害垃圾桶
 */
public class hazardousTrashcan extends trashcanObject {
    public hazardousTrashcan(){
        String name = "有害垃圾桶";
        int type = 2;
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
