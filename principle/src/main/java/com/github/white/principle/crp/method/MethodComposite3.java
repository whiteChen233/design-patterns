package com.github.white.principle.crp.method;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class MethodComposite3 {
    private MethodComposite3() {
    }

    public static class ParentClass {
        public void m1() {
            GlobalLogger.info("ParentClass method 1");
        }

        public void m2() {
            GlobalLogger.info("ParentClass method 2");
        }
    }

    // 在B中定义一个A的成员变量，并直接new出来
    public static class ChildClass {
        private final ParentClass parentClass;

        public ChildClass(ParentClass parentClass) {
            this.parentClass = parentClass;
        }

        public void m1() {
            parentClass.m1();
        }
        public void m2() {
            parentClass.m2();
        }

        public void m3() {
            GlobalLogger.info("ChildClass method");
        }
    }
}
