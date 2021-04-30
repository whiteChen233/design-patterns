package com.github.white.v1;

import com.github.white.GlobalLogger;

/**
 * The type Singleton v 1. 懒汉式-线程不安全
 */
public class SingletonV1 {

    /**
     * The constant v1. 懒汉式只声明,不创建
     */
    private static SingletonV1 v1;

    /**
     * Instantiates a new Singleton v 1.
     */
    private SingletonV1() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingletonV1 getInstance() {
        /*
         * 懒汉式创建实例是在第一次获调用getInstance()的时候
         * 在多线程情况下 会多次创建实例
         */
        if (v1 == null) {
            v1 = new SingletonV1();
            GlobalLogger.info("第一次创建实例");
        }
        GlobalLogger.info("获取实例");
        return v1;
    }
}
