package com.artofcoding.abstractFactory.demo.ant;

import com.artofcoding.abstractFactory.demo.Button;
import com.artofcoding.abstractFactory.demo.TextBox;
import com.artofcoding.abstractFactory.demo.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
