package com.github.white.mediator;

import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.*;

/**
 * The type Test mediator.
 */
public class TestMediator {

    /**
     * Test mediator.
     */
    @Test
    public void testMediator() {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        c2.send();
    }
}