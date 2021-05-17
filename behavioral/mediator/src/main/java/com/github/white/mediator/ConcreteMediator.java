package com.github.white.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Concrete mediator.
 */
public class ConcreteMediator extends Mediator {

    /**
     * The Colleagues.
     */
    private final List<Colleague> colleagues = new ArrayList<>();

    /**
     * Register.
     *
     * @param colleague the colleague
     */
    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    /**
     * Relay.
     *
     * @param cl the cl
     */
    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ob.receive();
            }
        }
    }
}
