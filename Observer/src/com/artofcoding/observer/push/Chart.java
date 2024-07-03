package com.artofcoding.observer.push;

public class Chart implements Observer{
    @Override
    public void update(int value) {
        System.out.println("Chart got updated with: " + value);
    }
}
