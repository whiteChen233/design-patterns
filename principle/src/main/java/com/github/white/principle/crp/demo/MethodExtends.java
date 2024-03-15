package com.github.white.principle.crp.demo;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class MethodExtends {

    private MethodExtends() {
    }

    /**
     * 父类中有m1，m2两个方法
     */
    public static class ParentClass {
        public void m1() {
            log.info("ParentClass method 1");
        }

        public void m2() {
            log.info("ParentClass method 2");
        }
    }


    /**
     * 子类通过继承A来拥有m1，m2两个方法
     */
    public static class ChildClass extends ParentClass {
        public void m3() {
            log.info("ChildClass method");
        }
    }
}
