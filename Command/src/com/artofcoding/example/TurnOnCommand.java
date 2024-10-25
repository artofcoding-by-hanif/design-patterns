package com.artofcoding.example;

public class TurnOnCommand implements Command {

    Receiver light;

    public TurnOnCommand(Receiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnON();
    }
}
