package com.example.experiment3.AdapterPattern;

public class TypeC implements USB{
    @Override
    public void getData() {
        System.out.println("读取数据");
    }

    @Override
    public void charge() {
        System.out.println("快速充电");
    }
}
