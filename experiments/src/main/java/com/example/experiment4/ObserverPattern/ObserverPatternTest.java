package com.example.experiment4.ObserverPattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        ProductFactory phoneFactory = new ProductFactory();
        QualityObserver qualityObserver = new QualityObserver(phoneFactory);
        EmployerObserver employerObserver = new EmployerObserver(phoneFactory);
        ManagerObserver managerObserver = new ManagerObserver(phoneFactory);
        System.out.println("当产品出现质量问题");
        phoneFactory.setStatus(false);
    }
}
