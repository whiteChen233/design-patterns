package com.github.white.principle.crp.method;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class MethodComposite1 {

    private MethodComposite1() {
    }

    public static class ParentClass {
        public void m1() {
            GlobalLogger.info("ParentClass method 1");
        }

        public void m2() {
            GlobalLogger.info("ParentClass method 2");
        }
    }

    // 通过向方法中传入A的引用来调用A中定义的方法
    public static class ChildClass {
        public void m1(ParentClass a) {
            a.m1();
        }

        public void m2(ParentClass a) {
            a.m2();
        }

        public void m3() {
            GlobalLogger.info("ChildClass method");
        }
    }
}
