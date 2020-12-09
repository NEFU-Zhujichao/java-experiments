package com.example.experiment3.AdapterPattern;

public class Micro implements USB{
    @Override
    public void getData() {
        System.out.println("读取数据");
    }

    @Override
    public void charge() {
        System.out.println("普通充电");
    }
}
