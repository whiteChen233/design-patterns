package com.github.white.v1;

import org.junit.Test;

import com.github.white.singleton.v1.SingletonV1;
import com.github.white.singleton.v3.SingletonV3;

import static org.junit.Assert.*;

public class SingletonV1Test {

    @Test
    public void testV1() {
        SingletonV1 v11 = SingletonV1.getInstance();
        SingletonV1 v12 = SingletonV1.getInstance();
        assertSame("获取的实例不相同", v11, v12);
    }

    @Test
    public void testV3() {
        SingletonV3 v31 = SingletonV3.getInstance();
        SingletonV3 v32 = SingletonV3.getInstance();
        assertSame("获取的实例不相同", v31, v32);
    }

}