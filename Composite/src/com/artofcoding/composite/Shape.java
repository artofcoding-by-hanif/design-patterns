package com.artofcoding.composite;

public class Shape implements Component {
    @Override
    public void render() {
        System.out.println("Render shape");
    }
}
