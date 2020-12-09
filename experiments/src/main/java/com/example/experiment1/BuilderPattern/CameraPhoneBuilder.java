package com.example.experiment1.BuilderPattern;

public class CameraPhoneBuilder implements PhoneBuilder{
    private Phone phone = new Phone();
    @Override
    public void buildCPU() {
        phone.setCPU("拍照CPU");
    }

    @Override
    public void buildMemory() {
        phone.setMemory("32G内存");

    }

    @Override
    public void buildBattery() {
        phone.setBattery("进口电池");

    }

    @Override
    public void buildScreen() {
        phone.setScreen("可以触屏屏幕");

    }

    @Override
    public void buildCamera() {
        phone.setCamera("索尼相机");

    }

    @Override
    public void buildGPS() {
        phone.setGPS("简单GPS");
    }

    @Override
    public void buildFingerIdentification() {
        phone.setFingerIdentification("有指纹识别");

    }

    @Override
    public void buildNFC() {
        phone.setNFC("有NFC");
    }

    @Override
    public Phone build() {
        return phone;
    }
}
