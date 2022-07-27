package com.github.white.command;

import java.util.stream.IntStream;

/**
 * The type Remote controller.
 */
public class RemoteController {

    /**
     * The On commands.
     */
    private final Command[] onCommands;

    /**
     * The Off commands.
     */
    private final Command[] offCommands;

    /**
     * The Undo command.
     */
    private Command undoCommand;

    /**
     * Instantiates a new Remote controller.
     */
    RemoteController() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        this.init();
    }

    /**
     * Init.
     */
    private void init() {
        IntStream.range(0, 5).forEach(i -> {
            this.onCommands[i] = new NoCommand();
            this.offCommands[i] = new NoCommand();
        });
    }

    /**
     * Sets command.
     *
     * @param no  the no
     * @param on  the on
     * @param off the off
     */
    public void setCommand(int no, Command on, Command off) {
        this.onCommands[no] = on;
        this.offCommands[no] = off;
    }

    /**
     * On button.
     *
     * @param on the on
     */
    public void onButton(int on) {
        Command current = this.onCommands[on];
        current.execute();
        undoCommand = current;
    }

    /**
     * Off button.
     *
     * @param on the on
     */
    public void offButton(int on) {
        Command current = this.offCommands[on];
        current.execute();
        undoCommand = current;
    }

    /**
     * Undo button.
     */
    public void undoButton() {
        undoCommand.undo();
    }
}
