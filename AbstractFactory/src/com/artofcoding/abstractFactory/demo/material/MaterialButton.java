package com.artofcoding.abstractFactory.demo.material;

import com.artofcoding.abstractFactory.demo.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
