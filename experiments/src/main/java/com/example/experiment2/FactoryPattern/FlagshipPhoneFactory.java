package com.example.experiment2.FactoryPattern;

public class FlagshipPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new FlagshipPhone("骁龙845","256G内存","超长待机","触控屏幕",
                "高像素","全球定位","有指纹识别","有NFC");
    }
}
