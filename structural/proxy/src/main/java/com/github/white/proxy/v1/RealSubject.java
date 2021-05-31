package com.github.white.proxy.v1;

import com.github.white.log.GlobalLogger;

/**
 * The type Real subject.
 */
public class RealSubject implements Subject {

    /**
     * Operate.
     */
    @Override
    public void operate() {
        GlobalLogger.info("访问真实主题方法");
    }
}
