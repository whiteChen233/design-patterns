package com.github.white.log;

import org.junit.Assert;
import org.junit.Test;

public class TestGlobalLogger {

    @Test
    public void testLog() {
        GlobalLogger.info("this is a message");
        Assert.assertTrue(true);
    }
}
