package com.artofcoding.bridge;

public class SonyTV implements  Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: turnON");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOFF");
    }

    @Override
    public void setChannel() {
        System.out.println("Sony: setChannel");
    }
}
