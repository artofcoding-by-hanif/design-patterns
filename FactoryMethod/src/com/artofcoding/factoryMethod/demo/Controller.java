package com.artofcoding.factoryMethod.demo;


import com.artofcoding.factoryMethod.demo.matcha.MachaViewEngine;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context){
        var engine = createViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine() {
        return new MachaViewEngine();
    }
}
