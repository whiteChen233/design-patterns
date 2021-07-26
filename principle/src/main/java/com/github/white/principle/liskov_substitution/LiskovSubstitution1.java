package com.github.white.principle.liskov_substitution;

import com.github.white.log.GlobalLogger;

public class LiskovSubstitution1 {

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

class A {
    void fun(int a, int b) {
        GlobalLogger.info("{}", a + b);
    }
}

class B extends A {
    @Override
    void fun(int a, int b) {
        GlobalLogger.info("{}", a - b);
    }

    void fun1(int a, int b) {
        GlobalLogger.info("{}", (a + b) - (a - b));
    }
}
