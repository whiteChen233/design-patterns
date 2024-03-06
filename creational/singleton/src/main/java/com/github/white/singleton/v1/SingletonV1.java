package com.github.white.singleton.v1;


import com.github.white.singleton.Helper;

import lombok.extern.slf4j.Slf4j;

/**
 * SingletonV1: 单例模式1
 *
 * @author White
 * @version 1.0
 * @date 2024/3/6 10:36
 */
@Slf4j
public class SingletonV1 {

    private SingletonV1() {
    }

    /**
     * The type Singleton v 1. 懒汉式-线程不安全
     * <p>
     * 优点：实现了Lazy Loading， 缺点：线程不安全
     */
    public static class Case1 {

        /**
         * The constant v1. 懒汉式只声明,不创建
         */
        private static Case1 v1;

        /**
         * Instantiates a new Singleton v 1.
         */
        private Case1() {
            Helper.logCreateInstance(log);
        }

        /**
         * Gets instance.
         *
         * @return the instance
         */
        public static Case1 getInstance() {
            /*
             * 懒汉式创建实例是在第一次获调用getInstance()的时候
             * 在多线程情况下 会多次创建实例
             */
            if (v1 == null) {
                v1 = new Case1();
            }
            Helper.logGetInstance(log);
            return v1;
        }

        /**
         * Do something.
         */
        public void doSomething() {
            Helper.logDoSomething(log, this);
        }
    }

    /**
     * The type Singleton v 2. 懒汉式-线程安全
     * <p>
     * 优点：解决了线程不安全问题 缺点：因为加了 synchronized 导致执行效率不高
     */
    public static class Case2V1 {

        /**
         * The constant v2.
         */
        private static Case2V1 v2;

        /**
         * Instantiates a new Singleton v 2.
         */
        private Case2V1() {
            Helper.logCreateInstance(log);
        }

        /**
         * Gets instance.
         *
         * @return the instance 在 getInstance 时加上同步锁保证线程安全
         */
        public static synchronized Case2V1 getInstance() {
            if (v2 == null) {
                v2 = new Case2V1();
            }
            Helper.logGetInstance(log);
            return v2;
        }

        /**
         * Do something.
         */
        public void doSomething() {
            Helper.logDoSomething(log, this);
        }
    }

    /**
     * The type V 2.
     * <p>
     * 这种方式看上去改进了上面的方式，但是还是线程不安全的，只要 if (instance == null) 这行代码有多个线程执行，那instance就会被多次实例
     *
     * @deprecated
     */
    @Deprecated
    public static class Case2V2 {

        /**
         * The constant instance.
         */
        private static Case2V2 instance;

        /**
         * Instantiates a new V 2.
         */
        private Case2V2() {
            Helper.logCreateInstance(log);
        }

        /**
         * Gets instance.
         *
         * @return the instance
         */
        public static Case2V2 getInstance() {
            if (instance == null) {
                synchronized (Case2V2.class) {
                    instance = new Case2V2();
                }
            }
            Helper.logGetInstance(log);
            return instance;
        }

        /**
         * Do something.
         */
        public void doSomething() {
            Helper.logDoSomething(log, this);
        }
    }
}
