package com.artofcoding.adapter;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("Applying Vivid filter");
    }
}
