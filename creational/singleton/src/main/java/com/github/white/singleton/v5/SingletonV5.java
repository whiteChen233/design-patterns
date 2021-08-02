package com.github.white.singleton.v5;

import com.github.white.log.GlobalLogger;

/**
 * The type Singleton v 5.  使用静态内部类持有当前对象的实例,保证实例是延迟加载的
 *
 * 优点：Lazy loading，线程安全
 */
public class SingletonV5 {

    /**
     * Instantiates a new Singleton v 5.
     */
    private SingletonV5() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingletonV5 getInstance() {
        return V5Holder.V5;
    }

    /**
     * The type V 5 holder.
     *
     * 类装载的时候是线程安全的 这里是JVM提供的线程安全保证
     */
    private static class V5Holder {
        /**
         * The constant V5.
         */
        private static final SingletonV5 V5 = new SingletonV5();
    }

    /**
     * Do something.
     */
    public void doSomething() {
        GlobalLogger.info("{}: doSomething", this.getClass().getSimpleName());
    }
}
