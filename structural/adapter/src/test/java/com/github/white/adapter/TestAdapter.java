package com.github.white.adapter;

import org.junit.Assert;
import org.junit.Test;

import com.github.white.adapter.v1.ClassAdapter;
import com.github.white.adapter.v2.ObjectAdapter;

/**
 * The type Test adapter.
 */
public class TestAdapter {

    /**
     * Test v 1.
     */
    @Test
    public void testV1() {
        Target target = new ClassAdapter();
        target.doSomething();
        Assert.assertNotNull(target);
    }

    /**
     * Test v 2.
     */
    @Test
    public void testV2() {
        Target target = new ObjectAdapter(new Adaptee());
        target.doSomething();
        Assert.assertNotNull(target);
    }
}
