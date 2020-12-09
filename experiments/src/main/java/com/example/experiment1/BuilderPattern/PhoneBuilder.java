package com.example.experiment1.BuilderPattern;

public abstract class PhoneBuilder {
    abstract void buildCPU();
    abstract void buildMemory();
    abstract void buildBattery();
    abstract void buildScreen();
    abstract void buildCamera();
    abstract void buildGPS();
    abstract void buildFingerIdentification();
    abstract void buildNFC();
    abstract Phone build();
}
