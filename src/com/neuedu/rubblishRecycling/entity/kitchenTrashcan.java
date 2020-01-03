package com.neuedu.rubblishRecycling.entity;

public class kitchenTrashcan extends trashcanObject {
    public kitchenTrashcan(){
        String name = "厨房垃圾桶";
        int type = 0;
        int capacity = 5;//容量
        this.setName(name);
        this.setType(type);
        this.setCapacity(capacity);
    }
    //回收垃圾
    @Override
    void recycleRubbish() {
    }
}
