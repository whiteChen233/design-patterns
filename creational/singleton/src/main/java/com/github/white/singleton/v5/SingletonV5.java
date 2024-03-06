package com.github.white.singleton.v5;


import org.slf4j.LoggerFactory;

import com.github.white.singleton.Helper;

import lombok.extern.slf4j.Slf4j;

/**
 * The enum Singleton v 5.
 * <p>
 * 优点：简单，线程安全，还能防止反序列化来重新创建对象
 *
 * @author White
 */
@Slf4j
public enum SingletonV5 {

    /**
     * V 5 singleton v 5.  v5就是枚举类的唯一实例
     */
    V5;

    SingletonV5() {
        LoggerFactory.getLogger(this.getClass()).info("Create the Instance");
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingletonV5 getInstance() {
        Helper.logGetInstance(log);
        return V5;
    }

    /**
     * Do something.
     */
    public void doSomething() {
        Helper.logDoSomething(log, this);
    }
}
