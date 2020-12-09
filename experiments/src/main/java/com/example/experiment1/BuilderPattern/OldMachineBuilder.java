package com.example.experiment1.BuilderPattern;

public class OldMachineBuilder extends PhoneBuilder{
    private Phone phone = new Phone();
    @Override
    public void buildCPU() {
        phone.setCPU("低配CPU");
    }

    @Override
    public void buildMemory() {
        phone.setMemory("16G内存");
    }

    @Override
    public void buildBattery() {
        phone.setBattery("较长待机");
    }

    @Override
    public void buildScreen() {
        phone.setScreen("不是触控屏幕");
    }

    @Override
    public void buildCamera() {
        phone.setCamera("没有相机");
    }

    @Override
    public void buildGPS() {
        phone.setGPS("没有GPS");
    }

    @Override
    public void buildFingerIdentification() {
        phone.setFingerIdentification("没有指纹识别");
    }

    @Override
    public void buildNFC() {
        phone.setNFC("没有NFC");
    }

    @Override
    public Phone build() {
        return phone;
    }
}
