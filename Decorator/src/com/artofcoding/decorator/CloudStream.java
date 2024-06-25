package com.artofcoding.decorator;

public class CloudStream implements Stream {

    @Override
    public void write(String data) {
        System.out.println("Storing "+data);
    }
}
