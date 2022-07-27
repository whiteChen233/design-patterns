package com.github.white.command;

import com.github.white.log.GlobalLogger;

/**
 * The type No command.
 */
public class NoCommand implements Command {

    /**
     * Execute.
     */
    @Override
    public void execute() {
        GlobalLogger.info("啥也不做");
    }

    /**
     * Undo.
     */
    @Override
    public void undo() {
        GlobalLogger.info("啥也不做");
    }
}
