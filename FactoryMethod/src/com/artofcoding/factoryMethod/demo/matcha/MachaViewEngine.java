package com.artofcoding.factoryMethod.demo.matcha;

import com.artofcoding.factoryMethod.demo.ViewEngine;

import java.util.Map;

public class MachaViewEngine implements ViewEngine {
    public String render(String viewName, Map<String, Object> context) {
        return "View Rendered by Macha";
    }
}
