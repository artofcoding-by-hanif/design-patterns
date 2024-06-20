package com.artofcoding.abstractFactory.demo.material;

import com.artofcoding.abstractFactory.demo.Button;
import com.artofcoding.abstractFactory.demo.TextBox;
import com.artofcoding.abstractFactory.demo.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
