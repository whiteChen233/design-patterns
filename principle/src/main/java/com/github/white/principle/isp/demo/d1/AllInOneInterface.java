package com.github.white.principle.isp.demo.d1;


import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public interface AllInOneInterface {

    void method1();

    void method2();

    void method3();

    void method4();

    void method5();

    default void log(int idx) {
        GlobalLogger.info("调用了 {} 实现的 method {}", this.getClass().getSimpleName(), idx);
    }
}
