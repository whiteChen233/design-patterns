package com.github.white.proxy.v2;

import com.github.white.log.GlobalLogger;

/**
 * The type Concrete subject.
 */
public class ConcreteSubject implements Subject {

    /**
     * Request.
     */
    @Override
    public void request() {
        GlobalLogger.info("使用JDK动态代理");
    }
}
