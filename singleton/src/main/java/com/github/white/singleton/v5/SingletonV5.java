package com.github.white.singleton.v5;

import com.github.white.GlobalLogger;

/**
 * The type Singleton v 5.  使用静态内部类持有当前对象的实例,保证实例是延迟加载的
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
        return V5Handler.V5;
    }

    /**
     * The type V 5 handler.
     */
    private static class V5Handler {
        /**
         * The constant V5.
         */
        private static final SingletonV5 V5 = new SingletonV5();
    }

    /**
     * Do some thing.
     */
    public void doSomething() {
        GlobalLogger.info("{}: doSomething", this.getClass().getSimpleName());
    }
}
