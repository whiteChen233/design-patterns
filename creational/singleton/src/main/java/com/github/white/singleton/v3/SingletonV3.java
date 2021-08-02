package com.github.white.singleton.v3;

import com.github.white.log.GlobalLogger;

/**
 * The type Singleton v 3. 饿汉式
 *
 * 优点：写法简单，在类装载时就完成实例化，避免了线程同步问题
 * 缺点：在类装载时就完成了实例化，没有达到Lazy Loading的效果，可能会造成内存浪费
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
     * Do something.
     */
    public void doSomething() {
        GlobalLogger.info("{}: doSomething", this.getClass().getSimpleName());
    }

    /**
     * The type Singleton v 32.
     *
     * 这种写法优缺点跟上面的基本没有区别，类装载的时候就执行静态代码块中的代码
     */
    public static class V2 {
        /**
         * The constant INSTANCE.
         */
        private static final V2 INSTANCE;

        /**
         * Instantiates a new Singleton v 32.
         */
        private V2() {}

        static {
            INSTANCE = new V2();
        }

        /**
         * Gets instance.
         *
         * @return the instance
         */
        public static V2 getInstance() {
            return INSTANCE;
        }

        /**
         * Do something.
         */
        public void doSomething() {
            GlobalLogger.info("{}: doSomething", this.getClass().getSimpleName());
        }
    }
}
