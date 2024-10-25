package com.artofcoding.example;

public class Invoker { // Remote control

    Command command;


    public void setCommand(Command command) {
        this.command = command;
    }


    public void pressButton() {
        this.command.execute();
    }
}
