package com.github.white.singleton.v2;


import com.github.white.singleton.Helper;

import lombok.extern.slf4j.Slf4j;

/**
 * SingletonV2: 单例模式2
 *
 * @author White
 * @version 1.0
 * @date 2024/3/6 10:35
 */
@Slf4j
public class SingletonV2 {

    private SingletonV2() {
    }

    /**
     * The type Singleton v 3. 饿汉式
     * <p>
     * 优点：写法简单，在类装载时就完成实例化，避免了线程同步问题 缺点：在类装载时就完成了实例化，没有达到Lazy Loading的效果，可能会造成内存浪费
     */
    public static class Case1 {

        /**
         * The constant V2. 声明的时候就创建了实例,所以不是懒加载
         */
        private static final Case1 V2 = new Case1();

        /**
         * Instantiates a new Singleton v 3.
         */
        private Case1() {
            Helper.logCreateInstance(log);
        }

        /**
         * Gets instance.
         *
         * @return the instance
         */
        public static Case1 getInstance() {
            Helper.logGetInstance(log);
            return V2;
        }

        /**
         * Do something.
         */
        public void doSomething() {
            Helper.logDoSomething(log, this);
        }
    }


    /**
     * The type Singleton v 32.
     * <p>
     * 这种写法优缺点跟上面的基本没有区别，类装载的时候就执行静态代码块中的代码
     */
    public static class Case2 {

        /**
         * The constant INSTANCE.
         */
        private static final Case2 INSTANCE;

        /**
         * Instantiates a new Singleton v 32.
         */
        private Case2() {
            Helper.logCreateInstance(log);
        }

        static {
            INSTANCE = new Case2();
        }

        /**
         * Gets instance.
         *
         * @return the instance
         */
        public static Case2 getInstance() {
            Helper.logGetInstance(log);
            return INSTANCE;
        }

        /**
         * Do something.
         */
        public void doSomething() {
            Helper.logDoSomething(log, this);
        }
    }

    /**
     * SingletonV2: 线程安全 但是不是懒加载
     *
     * @author White
     * @version 1.0
     * @date 2024/3/6 10:34
     */
    public static class Case3 {

        public static final Case3 INSTANCE = new Case3();

        private Case3() {
            Helper.logCreateInstance(log);
        }

        public void doSomething() {
            Helper.logDoSomething(log, this);
        }
    }
}
