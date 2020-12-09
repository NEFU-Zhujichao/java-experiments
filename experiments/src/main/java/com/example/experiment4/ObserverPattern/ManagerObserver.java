package com.example.experiment4.ObserverPattern;

public class ManagerObserver extends Observer{
    public ManagerObserver(ProductFactory productFactory) {
        this.productFactory = productFactory;
        productFactory.addObserver(this);
    }

    @Override
    public void response() {
        System.out.println("管理者：通知基层人员检查生产环境");
    }
}
