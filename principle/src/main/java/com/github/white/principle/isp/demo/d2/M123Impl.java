package com.github.white.principle.isp.demo.d2;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class M123Impl implements M1Interface, M23Interface {

    @Override
    public void method1() {
        GlobalLogger.info("调用了 {} 实现的 method 1", this.getClass().getSimpleName());
    }

    @Override
    public void method2() {
        GlobalLogger.info("调用了 {} 实现的 method 2", this.getClass().getSimpleName());
    }

    @Override
    public void method3() {
        GlobalLogger.info("调用了 {} 实现的 method 3", this.getClass().getSimpleName());
    }
}
