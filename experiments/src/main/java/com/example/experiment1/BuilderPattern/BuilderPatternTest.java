package com.example.experiment1.BuilderPattern;

import java.util.logging.Logger;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Director director = new Director();
        OldMachineBuilder oldMachineBuilder = new OldMachineBuilder();
        PhotoLoversPhoneBuilder photoLoversPhoneBuilder = new PhotoLoversPhoneBuilder();
        FlagshipPhoneBuilder flagshipPhoneBuilder = new FlagshipPhoneBuilder();
        director.construct(oldMachineBuilder);
        director.construct(photoLoversPhoneBuilder);
        director.construct(flagshipPhoneBuilder);
        Phone olderMobile = oldMachineBuilder.build();
        Phone cameraPhone = photoLoversPhoneBuilder.build();
        Phone flagPhone = flagshipPhoneBuilder.build();
        System.out.println(olderMobile);
        System.out.println(cameraPhone);
        System.out.println(flagPhone);
    }
}
