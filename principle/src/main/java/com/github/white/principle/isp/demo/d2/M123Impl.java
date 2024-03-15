package com.github.white.principle.isp.demo.d2;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class M123Impl implements M1Interface, M23Interface {

    @Override
    public void method1() {
        log.info("调用了 {} 实现的 method 1", this.getClass().getSimpleName());
    }

    @Override
    public void method2() {
        log.info("调用了 {} 实现的 method 2", this.getClass().getSimpleName());
    }

    @Override
    public void method3() {
        log.info("调用了 {} 实现的 method 3", this.getClass().getSimpleName());
    }
}
