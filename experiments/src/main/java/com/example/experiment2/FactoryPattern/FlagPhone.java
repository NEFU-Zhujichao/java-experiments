package com.example.experiment2.FactoryPattern;

public class FlagPhone implements Phone{
    private String CPU;
    private String memory;
    private String battery;
    private String screen;
    private String camera;
    private String GSP;
    private String fingerIdentification;
    private String NFC;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getGSP() {
        return GSP;
    }

    public void setGSP(String GSP) {
        this.GSP = GSP;
    }

    public String getFingerIdentification() {
        return fingerIdentification;
    }

    public void setFingerIdentification(String fingerIdentification) {
        this.fingerIdentification = fingerIdentification;
    }

    public String getNFC() {
        return NFC;
    }

    public void setNFC(String NFC) {
        this.NFC = NFC;
    }

    @Override
    public void outputInformation() {
        System.out.println("旗舰机手机属性 CUP：" + CPU +",内存：" + memory + ",电池：" + battery
                + ",屏幕：" + screen + ",相机：" + camera + ",GSP：" + GSP + ",指纹识别：" + fingerIdentification
                + ",NFC：" + NFC);
    }
}
