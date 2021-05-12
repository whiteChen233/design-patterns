package com.github.white.singleton.v3;

import com.github.white.log.GlobalLogger;

/**
 * The type Singleton v 3. 饿汉式
 */
public class SingletonV3 {

    /**
     * The constant V2. 声明的时候就创建了实例,所以不是懒加载
     */
    private static final SingletonV3 V2 = new SingletonV3();

    /**
     * Instantiates a new Singleton v 3.
     */
    private SingletonV3() {}

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingletonV3 getInstance() {
        return V2;
    }

    /**
     * Do some thing.
     */
    public void doSomething() {
        GlobalLogger.info("{}: doSomething", this.getClass().getSimpleName());
    }
}