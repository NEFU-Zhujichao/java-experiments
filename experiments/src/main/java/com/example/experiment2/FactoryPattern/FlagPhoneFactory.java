package com.example.experiment2.FactoryPattern;

public class FlagPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        FlagPhone flagPhone = new FlagPhone();
        flagPhone.setCPU("骁龙845");
        flagPhone.setBattery("超长待机");
        flagPhone.setMemory("256G内存");
        flagPhone.setCamera("高像素");
        flagPhone.setScreen("可以触屏屏幕");
        flagPhone.setFingerIdentification("具有指纹识别");
        flagPhone.setGSP("全球定位");
        flagPhone.setNFC("具有NFC");
        return flagPhone;
    }
}
