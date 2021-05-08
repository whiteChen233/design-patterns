package com.github.white.singleton.v6;

import com.github.white.GlobalLogger;

/**
 * The enum Singleton v 6.
 */
public enum SingletonV6 {

    /**
     * V 6 singleton v 6.  v6就是枚举类的唯一实例
     */
    V6;

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingletonV6 getInstance() {
        return V6;
    }

    /**
     * Do something.
     */
    public void doSomething() {
        GlobalLogger.info("{}: doSomething", this.getClass().getSimpleName());
    }
}
