package com.github.white.singleton.v2;

import com.github.white.GlobalLogger;

/**
 * The type Singleton v 2. 懒汉式-线程安全
 */
public class SingletonV2 {

    /**
     * The constant v2.
     */
    private static SingletonV2 v2;

    /**
     * Instantiates a new Singleton v 2.
     */
    private SingletonV2() {}

    /**
     * Gets instance.
     *
     * @return the instance 在 getInstance 时加上同步锁保证线程安全
     */
    public static synchronized SingletonV2 getInstance() {
        if (v2 == null) {
            v2 = new SingletonV2();
        }
        return v2;
    }

    /**
     * Do some thing.
     */
    public void doSomeThing() {
        GlobalLogger.info("doSomeThing");
    }
}
