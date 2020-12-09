package com.example.experiment2.FactoryPattern;

public class OlderMobile implements Phone{
    private String CUP;
    private String memory;
    private String battery;
    private String screen;

    public String getCUP() {
        return CUP;
    }

    public void setCUP(String CUP) {
        this.CUP = CUP;
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

    @Override
    public void outputInformation() {
        System.out.println("老年机手机属性 CUP：" + CUP +",内存：" + memory + ",电池：" + battery
                + ",屏幕：" + screen);
    }
}
