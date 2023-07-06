package com.github.white.principle.crp.method;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class MethodExtends {

    private MethodExtends() {
    }

    // 父类中有m1，m2两个方法
    public static class ParentClass {
        public void m1() {
            GlobalLogger.info("ParentClass method 1");
        }

        public void m2() {
            GlobalLogger.info("ParentClass method 2");
        }
    }


    // 子类通过继承A来拥有m1，m2两个方法
    public static class ChildClass extends ParentClass {
        public void m3() {
            GlobalLogger.info("ChildClass method");
        }
    }
}
