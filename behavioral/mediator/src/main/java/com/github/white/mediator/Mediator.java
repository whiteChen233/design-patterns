package com.github.white.mediator;

/**
 * The type Mediator.
 */
public abstract class Mediator {

    /**
     * Register.
     *
     * @param colleague the colleague
     */
    public abstract void register(Colleague colleague);

    /**
     * Relay.
     *
     * @param cl the cl
     */
    public abstract void relay(Colleague cl);
}
