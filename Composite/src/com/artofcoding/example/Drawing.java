package com.artofcoding.example;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Graphic {

    private final List<Graphic> children = new ArrayList<>();

    @Override
    public void render() {
        System.out.println("Rendering drawing");

        for (Graphic child : children) {
            child.render();
        }
    }

    @Override

    public void add(Graphic graphic) {
        this.children.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) {
        this.children.remove(graphic);
    }

    @Override
    public Graphic getChild(int index) {
        return children.get(index);
    }
}
