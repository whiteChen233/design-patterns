package com.github.white.singleton.v4;

import com.github.white.log.GlobalLogger;

/**
 * The type Singleton v 4. DCL,双重锁机制
 */
public class SingletonV4 {

    /**
     * The constant v4. 使用 volatile 关键字声明
     */
    private static volatile SingletonV4 v4;

    /**
     * Instantiates a new Singleton v 4.
     */
    private SingletonV4() {
    }

    /**
     * Gets instance.
     *
     * @return the instance  在获取实例的时候再使用 synchronized 关键字
     */
    public static SingletonV4 getInstance() {
        if (v4 == null) {
            synchronized (SingletonV4.class) {
                if (v4 == null) {
                    v4 = new SingletonV4();
                }
            }
        }
        return v4;
    }

    /**
     * Do some thing.
     */
    public void doSomething() {
        GlobalLogger.info("{}: doSomething", this.getClass().getSimpleName());
    }
}
