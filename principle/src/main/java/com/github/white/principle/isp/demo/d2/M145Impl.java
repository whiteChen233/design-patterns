package com.github.white.principle.isp.demo.d2;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class M145Impl implements M1Interface, M45Interface {

    @Override
    public void method1() {
        log.info("调用了 {} 实现的 method 1", this.getClass().getSimpleName());
    }

    @Override
    public void method4() {
        log.info("调用了 {} 实现的 method 4", this.getClass().getSimpleName());
    }

    @Override
    public void method5() {
        log.info("调用了 {} 实现的 method 5", this.getClass().getSimpleName());
    }
}
