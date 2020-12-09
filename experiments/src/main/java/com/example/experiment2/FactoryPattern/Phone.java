package com.example.experiment2.FactoryPattern;

public abstract class Phone {
    public abstract String getCPU();
    public abstract String getMemory();
    public abstract String getBattery();
    public abstract String getScreen();
    public abstract String getCamera();
    public abstract String getGPS();
    public abstract String getFingerIdentification();
    public abstract String getNFC();

    @Override
    public String toString() {
        return "CPU= "+this.getCPU()+", Memory= "+this.getMemory()+", Battery= "+this.getBattery()
                +", Screen= "+this.getScreen()+", Camera= "+this.getCamera()
                +", GPS= "+this.getGPS()+", FingerIdentification= "+getFingerIdentification()
                +", NFC= "+this.getNFC();
    }
}
