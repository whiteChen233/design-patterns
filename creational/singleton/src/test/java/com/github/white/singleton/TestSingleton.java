package com.github.white.singleton;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.white.singleton.v1.SingletonV1;
import com.github.white.singleton.v2.SingletonV2;
import com.github.white.singleton.v3.SingletonV3;
import com.github.white.singleton.v4.SingletonV4;
import com.github.white.singleton.v5.SingletonV5;

class TestSingleton {

    @Test
    void testV1() {
        SingletonV1.Case1 v11 = SingletonV1.Case1.getInstance();
        v11.doSomething();
        SingletonV1.Case1 v12 = SingletonV1.Case1.getInstance();
        v12.doSomething();
        Assertions.assertSame(v11, v12, "获取的实例不相同");

        SingletonV1.Case2V1 v1211 = SingletonV1.Case2V1.getInstance();
        v1211.doSomething();
        SingletonV1.Case2V1 v1212 = SingletonV1.Case2V1.getInstance();
        v1212.doSomething();
        Assertions.assertSame(v1211, v1212, "获取的实例不相同");

        SingletonV1.Case2V2 v1221 = SingletonV1.Case2V2.getInstance();
        v1221.doSomething();
        SingletonV1.Case2V2 v1222 = SingletonV1.Case2V2.getInstance();
        v1222.doSomething();
        Assertions.assertSame(v1221, v1222, "获取的实例不相同");
    }

    @Test
    void testV2() {
        SingletonV2.Case1 v211 = SingletonV2.Case1.getInstance();
        v211.doSomething();
        SingletonV2.Case1 v212 = SingletonV2.Case1.getInstance();
        v212.doSomething();
        Assertions.assertSame(v211, v212, "获取的实例不相同");

        SingletonV2.Case2 v221 = SingletonV2.Case2.getInstance();
        v221.doSomething();
        SingletonV2.Case2 v222 = SingletonV2.Case2.getInstance();
        v222.doSomething();
        Assertions.assertSame(v221, v222, "获取的实例不相同");

        SingletonV2.Case3 v231 = SingletonV2.Case3.INSTANCE;
        v231.doSomething();
        SingletonV2.Case3 v232 = SingletonV2.Case3.INSTANCE;
        v232.doSomething();
        Assertions.assertSame(v231, v232, "获取的实例不相同");
    }

    @Test
    void testV3() {
        SingletonV3 v31 = SingletonV3.getInstance();
        v31.doSomething();
        SingletonV3 v32 = SingletonV3.getInstance();
        v32.doSomething();
        Assertions.assertSame(v31, v32, "获取的实例不相同");
    }

    @Test
    void testV4() {
        SingletonV4 v41 = SingletonV4.getInstance();
        v41.doSomething();
        SingletonV4 v42 = SingletonV4.getInstance();
        v42.doSomething();
        Assertions.assertSame(v41, v42, "获取的实例不相同");
    }

    @Test
    void testV5() {
        SingletonV5 v51 = SingletonV5.getInstance();
        v51.doSomething();
        SingletonV5 v52 = SingletonV5.getInstance();
        v52.doSomething();
        Assertions.assertSame(v51, v52, "获取的实例不相同");
    }

}