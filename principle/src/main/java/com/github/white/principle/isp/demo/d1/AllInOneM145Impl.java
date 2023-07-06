package com.github.white.principle.isp.demo.d1;


/**
 * @author White
 */
public class AllInOneM145Impl implements AllInOneInterface {
    @Override
    public void method1() {
        log(1);
    }

    @Override
    public void method2() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    @Override
    public void method3() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    @Override
    public void method4() {
        log(4);
    }

    @Override
    public void method5() {
        log(5);
    }
}
