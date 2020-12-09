package com.example.experiment2.FactoryPattern;

public class OlderMobileFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        OlderMobile olderMobile = new OlderMobile();
        olderMobile.setCUP("老年CPU");
        olderMobile.setBattery("锂电池");
        olderMobile.setMemory("16G内存");
        olderMobile.setScreen("不可触屏屏幕");
        return olderMobile;
    }
}
