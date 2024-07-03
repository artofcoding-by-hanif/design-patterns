package com.artofcoding.observer.push;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet notified: " + value);
    }
}
