package com.github.white.adapter.v1;

import com.github.white.adapter.Adaptee;
import com.github.white.adapter.Target;

/**
 * The type Class adapter.
 */
public class ClassAdapter extends Adaptee implements Target {

    /**
     * Do something.
     */
    @Override
    public void doSomething() {
        super.doSomethingSpecial();
    }
}
