package com.artofcoding.abstractFactory.demo.ant;

import com.artofcoding.abstractFactory.demo.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
