package com.github.white.principle.isp.demo.d1;


/**
 * @author White
 */
public class AllInOneM123Impl implements AllInOneInterface {

    @Override
    public void method1() {
        log(1);
    }

    @Override
    public void method2() {
        log(2);
    }

    @Override
    public void method3() {
        log(3);
    }

    @Override
    public void method4() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    @Override
    public void method5() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }
}
