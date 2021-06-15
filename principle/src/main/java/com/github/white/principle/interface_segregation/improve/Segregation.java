package com.github.white.principle.interface_segregation.improve;

import com.github.white.log.GlobalLogger;

interface Interface1 {

    void method1();
}

interface Interface2 {

    void method2();

    void method3();
}

interface Interface3 {

    void method4();

    void method5();
}

class ClassA {

    public void method1(Interface1 i) {
        i.method1();
    }

    public void method2(Interface2 i) {
        i.method2();
    }

    public void method3(Interface2 i) {
        i.method3();
    }
}

class ClassB implements  Interface1, Interface2 {

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
}

class ClassC {

    public void method1(Interface1 i) {
        i.method1();
    }

    public void method4(Interface3 i) {
        i.method4();
    }

    public void method5(Interface3 i) {
        i.method5();
    }
}

class ClassD implements Interface1, Interface3 {

    @Override
    public void method1() {
        GlobalLogger.info( "{} 实现了 method 1", this.getClass().getSimpleName());
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
