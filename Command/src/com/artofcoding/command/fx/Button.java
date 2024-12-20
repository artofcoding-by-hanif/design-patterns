package com.artofcoding.command.fx;

public class Button { // Invoker
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void click() {
        command.execute();
    }
}
