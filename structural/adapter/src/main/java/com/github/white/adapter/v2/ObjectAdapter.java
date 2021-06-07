package com.github.white.adapter.v2;

import com.github.white.adapter.Adaptee;
import com.github.white.adapter.Target;

/**
 * The type Object adapter.
 */
public class ObjectAdapter implements Target {

    /**
     * The Adaptee.
     */
    private final Adaptee adaptee;

    /**
     * Instantiates a new Object adapter.
     *
     * @param adaptee the adaptee
     */
    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * Do something.
     */
    @Override
    public void doSomething() {
        adaptee.doSomethingSpecial();
    }
}
