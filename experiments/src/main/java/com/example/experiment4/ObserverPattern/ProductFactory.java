package com.example.experiment4.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {
    private List<Observer> observerList = new ArrayList<>();
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
        if (!status){
            System.out.println("产品质量不合格");
            wakeUpAllObservers();
        }
    }
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.removeIf(obser -> obser == observer);
    }

    public void wakeUpAllObservers(){
        observerList.forEach(Observer::response);
    }
}
