package com.github.white.principle.interface_segregation;

import com.github.white.log.GlobalLogger;

interface Interface {

    void method1();

    void method2();

    void method3();

    void method4();

    void method5();
}

class ClassA {

    public void method1(Interface i) {
        i.method1();
    }

    public void method2(Interface i) {
        i.method2();
    }

    public void method3(Interface i) {
        i.method3();
    }
}

class ClassB implements  Interface {

    @Override
    public void method1() {
        GlobalLogger.info( "{} 实现了 method 1", this.getClass().getSimpleName());
    }

    @Override
    public void method2() {
        GlobalLogger.info( "{} 实现了 method 2", this.getClass().getSimpleName());
    }

    @Override
    public void method3() {
        GlobalLogger.info( "{} 实现了 method 3", this.getClass().getSimpleName());
    }

    @Override
    public void method4() {
        GlobalLogger.info( "{} 实现了 method 4", this.getClass().getSimpleName());
    }

    @Override
    public void method5() {
        GlobalLogger.info( "{} 实现了 method 5", this.getClass().getSimpleName());
    }
}

class ClassC {

    public void method1(Interface i) {
        i.method1();
    }

    public void method4(Interface i) {
        i.method4();
    }

    public void method5(Interface i) {
        i.method5();
    }
}

class ClassD implements Interface {

    @Override
    public void method1() {
        GlobalLogger.info( "{} 实现了 method 1", this.getClass().getSimpleName());
    }

    @Override
    public void method2() {
        GlobalLogger.info( "{} 实现了 method 2", this.getClass().getSimpleName());
    }

    @Override
    public void method3() {
        GlobalLogger.info( "{} 实现了 method 3", this.getClass().getSimpleName());
    }

    @Override
    public void method4() {
        GlobalLogger.info( "{} 实现了 method 4", this.getClass().getSimpleName());
    }

    @Override
    public void method5() {
        GlobalLogger.info( "{} 实现了 method 5", this.getClass().getSimpleName());
    }
}
