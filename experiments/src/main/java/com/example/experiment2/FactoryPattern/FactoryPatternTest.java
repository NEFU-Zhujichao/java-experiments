package com.example.experiment2.FactoryPattern;

public class FactoryPatternTest {
    public static void main(String[] args) {
        Phone phone1 = new CameraPhoneFactory().getPhone();
        Phone phone2 = new OlderMobileFactory().getPhone();
        Phone phone3 = new FlagPhoneFactory().getPhone();
        phone1.outputInformation();
        phone2.outputInformation();
        phone3.outputInformation();
    }
}
