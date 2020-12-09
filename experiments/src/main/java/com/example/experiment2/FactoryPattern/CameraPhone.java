package com.example.experiment2.FactoryPattern;

public class CameraPhone implements Phone{
    private String CPU;
    private String memory;
    private String battery;
    private String screen;
    private String camera;

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

    @Override
    public void outputInformation() {
        System.out.println("拍照手机手机属性：CPU：" + CPU +",内存：" + memory + ",电池：" + battery
                + ",屏幕：" + screen + ",相机：" + camera);
    }
}
