package com.github.white.singleton.v4;


import com.github.white.singleton.Helper;

import lombok.extern.slf4j.Slf4j;

/**
 * The type Singleton v 4.  使用静态内部类持有当前对象的实例,保证实例是延迟加载的
 * <p>
 * 优点：Lazy loading，线程安全
 *
 * @author White
 */
@Slf4j
public class SingletonV4 {

    /**
     * Instantiates a new Singleton v 4.
     */
    private SingletonV4() {
        Helper.logCreateInstance(log);
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingletonV4 getInstance() {
        Helper.logGetInstance(log);
        return V4Holder.V4;
    }

    /**
     * The type V 4 holder.
     * <p>
     * 类装载的时候是线程安全的 这里是JVM提供的线程安全保证
     */
    private static class V4Holder {
        /**
         * The constant V4.
         */
        private static final SingletonV4 V4 = new SingletonV4();
    }

    /**
     * Do something.
     */
    public void doSomething() {
        Helper.logDoSomething(log, this);
    }
}
