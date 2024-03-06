package com.github.white.singleton.v3;


import com.github.white.singleton.Helper;

import lombok.extern.slf4j.Slf4j;

/**
 * The type Singleton v 3. DCL,双重锁机制
 * <p>
 * 优点：实现了Lazy Loading，并且线程安全，同时保证效率
 *
 * @author White
 */
@Slf4j
public class SingletonV3 {

    /**
     * The constant v3. 使用 volatile 关键字声明
     */
    private static volatile SingletonV3 v3;

    /**
     * Instantiates a new Singleton v 3.
     */
    private SingletonV3() {
        Helper.logCreateInstance(log);
    }

    /**
     * Gets instance.
     *
     * @return the instance  在获取实例的时候再使用 synchronized 关键字
     */
    public static SingletonV3 getInstance() {
        if (v3 == null) {
            synchronized (SingletonV3.class) {
                if (v3 == null) {
                    v3 = new SingletonV3();
                }
            }
        }
        Helper.logGetInstance(log);
        return v3;
    }

    /**
     * Do something.
     */
    public void doSomething() {
        Helper.logDoSomething(log, this);
    }
}
