package com.artofcoding.command;

import com.artofcoding.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command  {
    List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }
    @Override
    public void execute() {
        for (var command: commands) {
            command.execute();
        }
    }
}
