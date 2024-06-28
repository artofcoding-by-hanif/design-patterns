package com.artofcoding.command.editor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public  int size() {
        return commands.size();
    }
}
