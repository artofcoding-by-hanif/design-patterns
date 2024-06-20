package com.artofcoding.abstractFactory.demo.app;

import com.artofcoding.abstractFactory.demo.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
