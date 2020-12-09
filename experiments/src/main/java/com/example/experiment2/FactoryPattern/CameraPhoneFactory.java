package com.example.experiment2.FactoryPattern;

public class CameraPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        CameraPhone cameraPhone = new CameraPhone();
        cameraPhone.setCPU("拍照CPU");
        cameraPhone.setMemory("32G内存");
        cameraPhone.setBattery("进口电池");
        cameraPhone.setScreen("可以触屏屏幕");
        cameraPhone.setCamera("索尼相机");
        return cameraPhone;
    }
}