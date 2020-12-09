package com.example.experiment4.ObserverPattern;

public class EmployerObserver extends Observer{

    public EmployerObserver(ProductFactory productFactory) {
        this.productFactory = productFactory;
        productFactory.addObserver(this);
    }

    @Override
    public void response() {
        System.out.println("工人：立即停止生产产品，等待公司管理者商讨结果");
    }
}
