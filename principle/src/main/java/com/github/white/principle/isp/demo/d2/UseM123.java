package com.github.white.principle.isp.demo.d2;

/**
 * @author White
 */
public class UseM123 {

    public void depend1(M1Interface i) {
        i.method1();
    }

    public void depend2(M23Interface i) {
        i.method2();
    }

    public void depend3(M23Interface i) {
        i.method3();
    }
}
