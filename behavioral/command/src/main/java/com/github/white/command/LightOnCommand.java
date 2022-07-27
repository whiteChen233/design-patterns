package com.github.white.command;

/**
 * The type Light on command.
 */
public class LightOnCommand implements Command {

    /**
     * The Light receiver.
     */
    private final LightReceiver lightReceiver;

    /**
     * Instantiates a new Light on command.
     *
     * @param lightReceiver the light receiver
     */
    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    /**
     * Execute.
     */
    @Override
    public void execute() {
        lightReceiver.on();
    }

    /**
     * Undo.
     */
    @Override
    public void undo() {
        lightReceiver.off();
    }
}
