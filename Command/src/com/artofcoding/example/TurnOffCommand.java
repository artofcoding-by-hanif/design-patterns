package com.artofcoding.example;

public class TurnOffCommand implements Command {

    Receiver light;

    public TurnOffCommand(Receiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
