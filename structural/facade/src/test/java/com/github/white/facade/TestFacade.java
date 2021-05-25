package com.github.white.facade;

import org.junit.Test;

import com.github.white.facede.Computer;

/**
 * The type Test facade.
 */
public class TestFacade {

    /**
     * Test facade.
     */
    @Test
    public void testFacade() {
        Computer computer = new Computer();
        computer.bootUp();
        computer.shutDown();
    }
}
