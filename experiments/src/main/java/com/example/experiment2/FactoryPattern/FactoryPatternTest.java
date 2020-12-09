package com.example.experiment2.FactoryPattern;

public class FactoryPatternTest {
    public static void main(String[] args) {

        Phone phone1 = new OlderMachineFactory().getPhone();
        Phone phone2 = new PhotoLoversPhoneFactory().getPhone();
        Phone phone3 = new FlagshipPhoneFactory().getPhone();
        System.out.println("老年机："+phone1);
        System.out.println("拍照爱好者："+phone2);
        System.out.println("旗舰机："+phone3);
    }
}
