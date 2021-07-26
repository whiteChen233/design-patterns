package com.github.white.principle.liskov_substitution.improve;

import com.github.white.log.GlobalLogger;

/**
 * The type Liskov substitution.
 */
public class LiskovSubstitution {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        A a = new A();
        a.fun(1, 2);
        a.fun(11, 22);
        a.fun(111, 222);

        B b = new B();
        b.fun(1,2);
        b.fun(11,22);
        b.fun1(11,22);
        b.fun1(111,222);
    }
}

/**
 * The type Base.
 */
class Base {}

/**
 * The type A.
 */
class A extends Base {
    /**
     * Fun.
     *
     * @param a the a
     * @param b the b
     */
    void fun(int a, int b) {
        GlobalLogger.info("{}", a + b);
    }
}

/**
 * The type B.
 */
class B extends Base {

    /**
     * Fun.
     *
     * @param a the a
     * @param b the b
     */
    void fun(int a, int b) {
        GlobalLogger.info("{}", a - b);
    }

    /**
     * Fun 1.
     *
     * @param a the a
     * @param b the b
     */
    void fun1(int a, int b) {
        GlobalLogger.info("{}", (a + b) - (a - b));
    }
}
