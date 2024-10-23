package com.artofcoding.shape_bridge;

public class Square extends Shape {
    Renderer renderer;
    public Square(Renderer renderer) {
        super(renderer);

        this.renderer = renderer;
    }

    @Override
    public void draw() {

//      *** NOT GOOD ***

        this.renderer.render_circle(10);
    }
}
