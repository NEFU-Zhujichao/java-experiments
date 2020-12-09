package com.example.experiment2.FactoryPattern;

public class OldMachine extends Phone{
    private String CPU;
    private String memory;
    private String battery;
    private String screen;
    private String camera;
    private String GPS;
    private String fingerIdentification;
    private String NFC;

    public OldMachine() {}

    public OldMachine(String CPU, String memory, String battery, String screen, String camera, String GPS, String fingerIdentification, String NFC) {
        this.CPU = CPU;
        this.memory = memory;
        this.battery = battery;
        this.screen = screen;
        this.camera = camera;
        this.GPS = GPS;
        this.fingerIdentification = fingerIdentification;
        this.NFC = NFC;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }

    @Override
    public String getMemory() {
        return this.memory;
    }

    @Override
    public String getBattery() {
        return this.battery;
    }

    @Override
    public String getScreen() {
        return this.screen;
    }

    @Override
    public String getCamera() {
        return this.camera;
    }

    @Override
    public String getGPS() {
        return this.GPS;
    }

    @Override
    public String getFingerIdentification() {
        return this.fingerIdentification;
    }

    @Override
    public String getNFC() {
        return this.NFC;
    }
}
