package com.github.white.principle.crp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.github.white.principle.BasePrincipleTest;
import com.github.white.principle.crp.demo.MethodComposite1;
import com.github.white.principle.crp.demo.MethodComposite2;
import com.github.white.principle.crp.demo.MethodComposite3;
import com.github.white.principle.crp.demo.MethodExtends;

/**
 * @author White
 */
class CompositeReusePrincipleTest implements BasePrincipleTest {

    @Test
    void testDemoExtends() {
        execute(() -> {
            MethodExtends.ChildClass childClass = new MethodExtends.ChildClass();

            // 但是如果父类后续添加了新的方法，则子类也会同时拥有
            childClass.m1();
            childClass.m2();
            childClass.m3();
        });
    }

    @Test
    void testComposite1() {
        execute(() -> {
            MethodComposite1.ParentClass parentClass = new MethodComposite1.ParentClass();
            MethodComposite1.ChildClass childClass = new MethodComposite1.ChildClass();

            childClass.m1(parentClass);
            childClass.m2(parentClass);
            childClass.m3();
        });
    }

    @Test
    void testComposite2() {
        execute(() -> {
            MethodComposite2.ParentClass parentClass = new MethodComposite2.ParentClass();
            MethodComposite2.ChildClass childClass = new MethodComposite2.ChildClass();
            childClass.setParentClass(parentClass);

            childClass.m1();
            childClass.m2();
            childClass.m3();
        });
    }

    @Test
    void testComposite3() {
        execute(() -> {
            MethodComposite3.ParentClass parentClass = new MethodComposite3.ParentClass();
            MethodComposite3.ChildClass childClass = new MethodComposite3.ChildClass(parentClass);

            childClass.m1();
            childClass.m2();
            childClass.m3();
        });
    }
}
