package com.artofcoding.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
