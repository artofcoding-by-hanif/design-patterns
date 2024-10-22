package com.artofcoding.shape_bridge;

public class VectorRenderer implements Renderer {

    @Override
    public void render_circle(double radius) {
        String message = String.format("Drawing a circle of radius %f with vectors", radius);
        System.out.println(message);
    }
}
