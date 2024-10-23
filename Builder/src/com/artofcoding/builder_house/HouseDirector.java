package com.artofcoding.builder_house;

public class HouseDirector {
    HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void construct() {
        this.houseBuilder.buildWalls();
        this.houseBuilder.build_doors();
    }
}
