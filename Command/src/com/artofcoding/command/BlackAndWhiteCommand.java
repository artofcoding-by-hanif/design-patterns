package com.artofcoding.command;

import com.artofcoding.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
