package com.github.white.principle.crp.demo;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class MethodComposite2 {

    private MethodComposite2() {
    }

    public static class ParentClass {
        public void m1() {
            log.info("ParentClass method 1");
        }

        public void m2() {
            log.info("ParentClass method 2");
        }
    }

    public static class ChildClass {
        private ParentClass parentClass;

        // 在B中定义一个A的成员变量，通过setter方法注入
        public void setParentClass(ParentClass parentClass) {
            this.parentClass = parentClass;
        }

        public void m1() {
            parentClass.m1();
        }
        public void m2() {
            parentClass.m2();
        }

        public void m3() {
            log.info("ChildClass method");
        }
    }
}
