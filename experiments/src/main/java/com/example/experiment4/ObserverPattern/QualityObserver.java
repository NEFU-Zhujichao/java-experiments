package com.example.experiment4.ObserverPattern;

public class QualityObserver extends Observer{

    public QualityObserver(ProductFactory productFactory) {
        this.productFactory = productFactory;
        productFactory.addObserver(this);
    }

    @Override
    public void response() {
        System.out.println("质检员：发现产品有质量问题，通知所有工人停工，响应情况给管理者");
    }
}
