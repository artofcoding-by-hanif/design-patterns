package com.artofcoding.builder_house;

import java.util.ArrayList;
import java.util.List;

public class House {
    List<String> parts;

    public House() {
        this.parts = new ArrayList<>();
    }

    public void addPart(String part) {
        this.parts.add(part);
    }

    public void show() {
        System.out.println("House parts "+parts);
    }
}
