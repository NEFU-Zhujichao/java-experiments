package com.example.experiment3.AdapterPattern;

public class Phone {
    public void play(MicroToTypeC adapter){
        adapter.conversion();
    }

    public void play(TypeC typeC){
        typeC.getData();
        typeC.charge();
    }
}
