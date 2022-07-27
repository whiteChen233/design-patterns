package com.github.white.command;

/**
 * The type Light off command.
 */
public class LightOffCommand implements Command {

    /**
     * The Light receiver.
     */
    private final LightReceiver lightReceiver;

    /**
     * Instantiates a new Light off command.
     *
     * @param lightReceiver the light receiver
     */
    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    /**
     * Execute.
     */
    @Override
    public void execute() {
        lightReceiver.off();
    }

    /**
     * Undo.
     */
    @Override
    public void undo() {
        lightReceiver.on();
    }
}
