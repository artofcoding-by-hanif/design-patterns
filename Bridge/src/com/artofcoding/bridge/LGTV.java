package com.artofcoding.bridge;

public class LGTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("LG: turnON");
    }

    @Override
    public void turnOff() {
        System.out.println("LG: turnFF");
    }

    @Override
    public void setChannel() {
        System.out.println("LG: Set Channel");
    }

    public void recognizeSpeech() {
        System.out.println("LG: Recognize speech");
    }
}
