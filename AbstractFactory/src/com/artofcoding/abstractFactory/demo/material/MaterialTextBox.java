package com.artofcoding.abstractFactory.demo.material;

import com.artofcoding.abstractFactory.demo.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material Textbox");
    }
}
