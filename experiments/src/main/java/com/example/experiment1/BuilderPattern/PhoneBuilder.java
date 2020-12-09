package com.example.experiment1.BuilderPattern;

public interface PhoneBuilder {
    void buildCPU();
    void buildMemory();
    void buildBattery();
    void buildScreen();
    void buildCamera();
    void buildGPS();
    void buildFingerIdentification();
    void buildNFC();
    Phone build();
}
