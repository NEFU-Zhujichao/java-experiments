package com.example.experiment2.FactoryPattern;

public class OlderMachineFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
         return new OldMachine("低配CPU","16G内存","较长待机",
                 "不是触控屏幕","没有相机","没有GPS",
                 "没有指纹识别","没有NFC");
    }
}
