package com.example.experiment3.AdapterPattern;

public class Adapter implements MicroToTypeC{
    private Micro micro;

    public void setMicro(Micro micro) {
        this.micro = micro;
    }

    @Override
    public void conversion() {
        micro.getData();
        micro.charge();
    }
}
