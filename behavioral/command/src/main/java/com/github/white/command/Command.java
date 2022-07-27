package com.github.white.command;

/**
 * The interface Command.
 */
public interface Command {

    /**
     * Execute.
     */
    void execute();

    /**
     * Undo.
     */
    void undo();
}
