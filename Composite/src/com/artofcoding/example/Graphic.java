package com.artofcoding.example;

public interface Graphic {

    void render();
    void add(Graphic graphic);
    void remove(Graphic graphic);
    Graphic getChild(int index);
}
