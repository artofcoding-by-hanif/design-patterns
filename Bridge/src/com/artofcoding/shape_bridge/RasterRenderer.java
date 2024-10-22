package com.artofcoding.shape_bridge;

public class RasterRenderer implements Renderer {

    @Override
    public void render_circle(double radius) {
        String message = String.format("Drawing a circle of radius %f with pixels", radius);
        System.out.println(message);
    }
}
