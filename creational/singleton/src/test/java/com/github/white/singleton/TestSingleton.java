package com.github.white.singleton;

import org.junit.Test;

import com.github.white.singleton.v1.SingletonV1;
import com.github.white.singleton.v2.SingletonV2;
import com.github.white.singleton.v3.SingletonV3;
import com.github.white.singleton.v4.SingletonV4;
import com.github.white.singleton.v5.SingletonV5;
import com.github.white.singleton.v6.SingletonV6;

import static org.junit.Assert.*;

public class TestSingleton {

    @Test
    public void testV1() {
        SingletonV1 v11 = SingletonV1.getInstance();
        SingletonV1 v12 = SingletonV1.getInstance();
        assertSame("获取的实例不相同", v11, v12);
        v11.doSomething();
    }

    @Test
    public void testV2() {
        SingletonV2 v21 = SingletonV2.getInstance();
        SingletonV2 v22 = SingletonV2.getInstance();
        assertSame("获取的实例不相同", v21, v22);
        v21.doSomething();
    }

    @Test
    public void testV3() {
        SingletonV3 v31 = SingletonV3.getInstance();
        SingletonV3 v32 = SingletonV3.getInstance();
        assertSame("获取的实例不相同", v31, v32);
        v31.doSomething();
    }

    @Test
    public void testV4() {
        SingletonV4 v41 = SingletonV4.getInstance();
        SingletonV4 v42 = SingletonV4.getInstance();
        assertSame("获取的实例不相同", v41, v42);
        v41.doSomething();
    }

    @Test
    public void testV5() {
        SingletonV5 v51 = SingletonV5.getInstance();
        SingletonV5 v52 = SingletonV5.getInstance();
        assertSame("获取的实例不相同", v51, v52);
        v51.doSomething();
    }

    @Test
    public void testV6() {
        SingletonV6 v61 = SingletonV6.getInstance();
        SingletonV6 v62 = SingletonV6.getInstance();
        assertSame("获取的实例不相同", v61, v62);
        v61.doSomething();
    }

}