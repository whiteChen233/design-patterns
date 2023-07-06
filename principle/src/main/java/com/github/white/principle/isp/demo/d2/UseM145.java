package com.github.white.principle.isp.demo.d2;

/**
 * @author White
 */
public class UseM145 {

    public void depend1(M1Interface i) {
        i.method1();
    }

    public void depend4(M45Interface i) {
        i.method4();
    }

    public void depend5(M45Interface i) {
        i.method5();
    }
}
