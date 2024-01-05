package com.github.white.abstractfactory;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAbstractFactory {

    @Test
    public void test() {
        Computer dell = new DellComputer();
        dell.getKeyboard().use();
        dell.getMouse().use();
        Assertions.assertNotNull(dell);

        Computer hp = new HpComputer();
        hp.getKeyboard().use();
        hp.getMouse().use();
        Assertions.assertNotNull(hp);
    }
}
