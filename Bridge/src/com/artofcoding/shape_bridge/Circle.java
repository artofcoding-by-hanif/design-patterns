package com.artofcoding.shape_bridge;

public class Circle extends Shape  {
    Renderer renderer;
    double radius;

    public Circle(Renderer renderer, double radius) {
        super(renderer);
        this.renderer = renderer;
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();

        this.renderer.render_circle(radius);
    }
}
