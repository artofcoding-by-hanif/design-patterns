package com.artofcoding.abstractFactory.demo.ant;

import com.artofcoding.abstractFactory.demo.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
