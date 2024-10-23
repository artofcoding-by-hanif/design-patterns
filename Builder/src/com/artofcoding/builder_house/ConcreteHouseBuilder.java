package com.artofcoding.builder_house;

public class ConcreteHouseBuilder implements HouseBuilder {

    House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.addPart("Walls");
    }

    @Override
    public void build_doors() {
        this.house.addPart("Doors");
    }

    @Override
    public House get_results() {
        return this.house;
    }
}
