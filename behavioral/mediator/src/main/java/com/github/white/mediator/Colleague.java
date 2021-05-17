package com.github.white.mediator;

/**
 * The type Colleague.
 */
public abstract class Colleague {

    /**
     * The Mediator.
     */
    protected Mediator mediator;

    /**
     * Sets mediator.
     *
     * @param mediator the mediator
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Receive.
     */
    public abstract void receive();

    /**
     * Send.
     */
    public abstract void send();
}
