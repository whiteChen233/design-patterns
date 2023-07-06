package com.github.white.principle.isp.demo.d2;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class M145Impl implements M1Interface, M45Interface {

    @Override
    public void method1() {
        GlobalLogger.info("调用了 {} 实现的 method 1", this.getClass().getSimpleName());
    }

    @Override
    public void method4() {
        GlobalLogger.info("调用了 {} 实现的 method 4", this.getClass().getSimpleName());
    }

    @Override
    public void method5() {
        GlobalLogger.info("调用了 {} 实现的 method 5", this.getClass().getSimpleName());
    }
}
