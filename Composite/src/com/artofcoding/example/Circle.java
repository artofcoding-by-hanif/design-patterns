package com.artofcoding.example;

public class Circle implements Graphic {
    @Override
    public void render() {
        System.out.println("Rendering Circle");
    }

    @Override
    public void add(Graphic graphic) {
        throw new UnsupportedOperationException("Leaf nodes cannot add children");
    }

    @Override
    public void remove(Graphic graphic) {
        throw new UnsupportedOperationException("Leaf nodes cannot remove children");
    }

    @Override
    public Graphic getChild(int index) {
        throw new UnsupportedOperationException("Leaf nodes do not have children");
    }
}
