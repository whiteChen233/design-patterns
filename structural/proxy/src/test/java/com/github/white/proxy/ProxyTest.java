package com.github.white.proxy;

import org.junit.Assert;
import org.junit.Test;

import com.github.white.proxy.v1.Proxy;
import com.github.white.proxy.v1.RealSubject;
import com.github.white.proxy.v2.ConcreteSubject;
import com.github.white.proxy.v2.ProxyHandler;
import com.github.white.proxy.v2.Subject;


/**
 * The type Proxy test.
 */
public class ProxyTest {

    /**
     * Test v 1.
     */
    @Test
    public void testV1() {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.operate();
        Assert.assertNotNull(proxy.getSubject());
    }

    @Test
    public void testV2() {
        ProxyHandler proxyHandler = new ProxyHandler();
        Subject subject = (Subject) proxyHandler.newProxyInstance(new ConcreteSubject());
        subject.request();
        Assert.assertNotNull(subject);
    }

}