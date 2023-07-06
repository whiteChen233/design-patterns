package com.github.white.principle.isp.demo;

import com.github.white.principle.isp.demo.d1.AllInOneM123Impl;
import com.github.white.principle.isp.demo.d1.AllInOneM145Impl;
import com.github.white.principle.isp.demo.d1.AllInOneUseM123;
import com.github.white.principle.isp.demo.d1.AllInOneUseM145;
import com.github.white.principle.isp.demo.d2.UseM123;
import com.github.white.principle.isp.demo.d2.M123Impl;
import com.github.white.principle.isp.demo.d2.UseM145;
import com.github.white.principle.isp.demo.d2.M145Impl;

/**
 * @author White
 */
public class InterfaceSegregationPrincipleTest {

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        // 通过接口Interface依赖（使用）B类，但是只会用到1，2，3方法
        AllInOneM123Impl allInOneM123Impl = new AllInOneM123Impl();
        AllInOneUseM123 allInOneUseM123 = new AllInOneUseM123();
        allInOneUseM123.method1(allInOneM123Impl);
        allInOneUseM123.method2(allInOneM123Impl);
        allInOneUseM123.method3(allInOneM123Impl);

        // 通过接口Interface依赖（使用）D类，但是只会用到1，4，5方法
        AllInOneM145Impl allInOneM145Impl = new AllInOneM145Impl();
        AllInOneUseM145 allInOneUseM145 = new AllInOneUseM145();
        allInOneUseM145.method1(allInOneM145Impl);
        allInOneUseM145.method4(allInOneM145Impl);
        allInOneUseM145.method5(allInOneM145Impl);

        // 不管对于实现类 AllInOneM123Impl 还是 AllInOneM145Impl 来说，都要实现 Interface 中所有的方法
    }

    private static void test2() {
        // 将职责细分之后，需要什么方法就去实现什么方法

        UseM123 a = new UseM123();
        M123Impl b = new M123Impl();
        a.depend1(b);
        a.depend2(b);
        a.depend3(b);

        UseM145 c = new UseM145();
        M145Impl d = new M145Impl();
        c.depend1(d);
        c.depend4(d);
        c.depend5(d);
    }
}

