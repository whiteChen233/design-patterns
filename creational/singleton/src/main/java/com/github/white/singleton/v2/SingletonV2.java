package com.github.white.singleton.v2;

import com.github.white.log.GlobalLogger;

/**
 * The type Singleton v 2. 懒汉式-线程安全
 * <p>
 * 优点：解决了线程不安全问题
 * 缺点：因为加了 synchronized 导致执行效率不高
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
     * Do something.
     */
    public void doSomething() {
        GlobalLogger.info("{}: doSomething", this.getClass().getSimpleName());
    }

    /**
     * The type V 2.
     *
     * 这种方式看上去改进了上面的方式，但是还是线程不安全的，只要 if (instance == null) 这行代码有多个线程执行，那instance就会被多次实例
     */
    public static class V2 {

        /**
         * The constant instance.
         */
        private static V2 instance;

        /**
         * Instantiates a new V 2.
         */
        private V2() {}

        /**
         * Gets instance.
         *
         * @return the instance
         */
        public static V2 getInstance() {
            if (instance == null) {
                synchronized (V2.class) {
                    instance = new V2();
                }
            }
            return instance;
        }

        /**
         * Do something.
         */
        public void doSomething() {
            GlobalLogger.info("{}: doSomething", this.getClass().getSimpleName());
        }
    }
}
