package com.github.white.v1;

import org.junit.Test;

import com.github.white.singleton.v1.SingletonV1;
import com.github.white.singleton.v2.SingletonV2;
import com.github.white.singleton.v3.SingletonV3;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testV1() {
        SingletonV1 v11 = SingletonV1.getInstance();
        SingletonV1 v12 = SingletonV1.getInstance();
        assertSame("获取的实例不相同", v11, v12);
    }

    @Test
    public void testV2() {
        SingletonV2 v21 = SingletonV2.getInstance();
        SingletonV2 v22 = SingletonV2.getInstance();
        assertSame("获取的实例不相同", v21, v22);
    }

    @Test
    public void testV3() {
        SingletonV3 v31 = SingletonV3.getInstance();
        SingletonV3 v32 = SingletonV3.getInstance();
        assertSame("获取的实例不相同", v31, v32);
    }

}