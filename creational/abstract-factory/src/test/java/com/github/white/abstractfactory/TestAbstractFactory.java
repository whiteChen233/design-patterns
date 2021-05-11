package com.github.white.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class TestAbstractFactory {

    @Test
    public void test() {
        Computer dell = new DellComputer();
        dell.getKeyboard().use();
        dell.getMouse().use();
        Assert.assertNotNull(dell);

        Computer hp = new HpComputer();
        hp.getKeyboard().use();
        hp.getMouse().use();
        Assert.assertNotNull(hp);
    }
}
