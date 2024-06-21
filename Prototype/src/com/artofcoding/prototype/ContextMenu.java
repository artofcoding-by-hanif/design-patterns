package com.artofcoding.prototype;

public class ContextMenu {
    public void duplicate(Component component) {
        Component newComponent = component.clone();
        System.out.println("Duplicated: "+newComponent);
    }
}
