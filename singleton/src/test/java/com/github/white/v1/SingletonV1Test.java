package com.github.white.v1;

import org.junit.Assert;
import org.junit.Test;

import com.github.white.GlobalLogger;

import static org.junit.Assert.*;

public class SingletonV1Test {

    @Test
    public void testV1() {
        SingletonV1 v11 = SingletonV1.getInstance();
        SingletonV1 v12 = SingletonV1.getInstance();
        assertSame("获取的实例不相同", v11, v12);
    }

}