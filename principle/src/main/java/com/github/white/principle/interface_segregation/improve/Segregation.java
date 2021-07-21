package com.github.white.principle.interface_segregation.improve;

import com.github.white.log.GlobalLogger;

/**
 * The type Segregation.
 */
public class Segregation {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        ClassC c = new ClassC();
        ClassD d = new ClassD();
        c.depend1(d);
        c.depend4(d);
        c.depend5(d);
    }
}

/**
 * The interface Interface 1.
 */
interface Interface1 {

    /**
     * Method 1.
     */
    void method1();
}

/**
 * The interface Interface 2.
 */
interface Interface2 {

    /**
     * Method 2.
     */
    void method2();

    /**
     * Method 3.
     */
    void method3();
}

/**
 * The interface Interface 3.
 */
interface Interface3 {

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
 */
class ClassA {

    /**
     * Method 1.
     *
     * @param i the
     */
    public void depend1(Interface1 i) {
        i.method1();
    }

    /**
     * Method 2.
     *
     * @param i the
     */
    public void depend2(Interface2 i) {
        i.method2();
    }

    /**
     * Method 3.
     *
     * @param i the
     */
    public void depend3(Interface2 i) {
        i.method3();
    }
}

/**
 * The type Class b.
 */
class ClassB implements  Interface1, Interface2 {

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
}

/**
 * The type Class c.
 */
class ClassC {

    /**
     * Method 1.
     *
     * @param i the
     */
    public void depend1(Interface1 i) {
        i.method1();
    }

    /**
     * Method 4.
     *
     * @param i the
     */
    public void depend4(Interface3 i) {
        i.method4();
    }

    /**
     * Method 5.
     *
     * @param i the
     */
    public void depend5(Interface3 i) {
        i.method5();
    }
}

/**
 * The type Class d.
 */
class ClassD implements Interface1, Interface3 {

    /**
     * Method 1.
     */
    @Override
    public void method1() {
        GlobalLogger.info( "{} 实现了 method 1", this.getClass().getSimpleName());
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
