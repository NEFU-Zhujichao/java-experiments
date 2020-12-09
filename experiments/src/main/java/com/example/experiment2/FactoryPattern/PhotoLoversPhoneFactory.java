package com.example.experiment2.FactoryPattern;

public class PhotoLoversPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new PhotoLoversPhone("拍照CPU","32G内存","较长待机","触控屏幕",
                "1800W超高像素","简单GPS","有指纹识别","有NFC");
    }
}