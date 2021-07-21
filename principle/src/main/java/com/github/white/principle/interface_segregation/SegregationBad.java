package com.github.white.principle.interface_segregation;

import com.github.white.log.GlobalLogger;

/**
 * The interface Interface.
 */
interface Interface {

    /**
     * Method 1.
     */
    void method1();

    /**
     * Method 2.
     */
    void method2();

    /**
     * Method 3.
     */
    void method3();

    /**
     * Method 4.
     */
    void method4();

    /**
     * Method 5.
     */
    void method5();
}

/**
 * The type Class a.
 * A 通过接口Interface依赖（使用）B类，但是只会用到1，2，3方法
 */
class ClassA {

    /**
     * Method 1.
     *
     * @param i the
     */
    public void method1(Interface i) {
        i.method1();
    }

    /**
     * Method 2.
     *
     * @param i the
     */
    public void method2(Interface i) {
        i.method2();
    }

    /**
     * Method 3.
     *
     * @param i the
     */
    public void method3(Interface i) {
        i.method3();
    }
}

/**
 * The type Class b.
 */
class ClassB implements  Interface {

    /**
     * Method 1.
     */
    @Override
    public void method1() {
        GlobalLogger.info( "{} 实现了 method 1", this.getClass().getSimpleName());
    }

    /**
     * Method 2.
     */
    @Override
    public void method2() {
        GlobalLogger.info( "{} 实现了 method 2", this.getClass().getSimpleName());
    }

    /**
     * Method 3.
     */
    @Override
    public void method3() {
        GlobalLogger.info( "{} 实现了 method 3", this.getClass().getSimpleName());
    }

    /**
     * Method 4.
     */
    @Override
    public void method4() {
        GlobalLogger.info( "{} 实现了 method 4", this.getClass().getSimpleName());
    }

    /**
     * Method 5.
     */
    @Override
    public void method5() {
        GlobalLogger.info( "{} 实现了 method 5", this.getClass().getSimpleName());
    }
}

/**
 * The type Class c.
 * C 通过接口Interface依赖（使用）D类，但是只会用到1，4，5方法
 */
class ClassC {

    /**
     * Method 1.
     *
     * @param i the
     */
    public void method1(Interface i) {
        i.method1();
    }

    /**
     * Method 4.
     *
     * @param i the
     */
    public void method4(Interface i) {
        i.method4();
    }

    /**
     * Method 5.
     *
     * @param i the
     */
    public void method5(Interface i) {
        i.method5();
    }
}

/**
 * The type Class d.
 */
class ClassD implements Interface {

    /**
     * Method 1.
     */
    @Override
    public void method1() {
        GlobalLogger.info( "{} 实现了 method 1", this.getClass().getSimpleName());
    }

    /**
     * Method 2.
     */
    @Override
    public void method2() {
        GlobalLogger.info( "{} 实现了 method 2", this.getClass().getSimpleName());
    }

    /**
     * Method 3.
     */
    @Override
    public void method3() {
        GlobalLogger.info( "{} 实现了 method 3", this.getClass().getSimpleName());
    }

    /**
     * Method 4.
     */
    @Override
    public void method4() {
        GlobalLogger.info( "{} 实现了 method 4", this.getClass().getSimpleName());
    }

    /**
     * Method 5.
     */
    @Override
    public void method5() {
        GlobalLogger.info( "{} 实现了 method 5", this.getClass().getSimpleName());
    }
}
