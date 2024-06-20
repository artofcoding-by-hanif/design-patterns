package com.artofcoding.factoryMethod.demo;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
