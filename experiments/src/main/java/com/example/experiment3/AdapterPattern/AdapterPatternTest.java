package com.example.experiment3.AdapterPattern;

public class AdapterPatternTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        TypeC typeC = new TypeC();
        phone.play(typeC);
        System.out.println("--------------");
        Micro micro = new Micro();
        Adapter adapter = new Adapter();
        adapter.setMicro(micro);
        phone.play(adapter);
    }
}
