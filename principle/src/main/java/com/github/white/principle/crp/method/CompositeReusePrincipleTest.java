package com.github.white.principle.crp.method;

/**
 * @author White
 */
public class CompositeReusePrincipleTest {

    public static void main(String[] args) {
        testDemoExtends();
        testComposite1();
        testComposite2();
        testComposite3();
    }

    private static void testDemoExtends() {
        MethodExtends.ChildClass childClass = new MethodExtends.ChildClass();

        // 但是如果父类后续添加了新的方法，则子类也会同时拥有
        childClass.m1();
        childClass.m2();
        childClass.m3();
    }

    private static void testComposite1() {
        MethodComposite1.ParentClass parentClass = new MethodComposite1.ParentClass();
        MethodComposite1.ChildClass childClass = new MethodComposite1.ChildClass();

        childClass.m1(parentClass);
        childClass.m2(parentClass);
        childClass.m3();
    }

    private static void testComposite2() {
        MethodComposite2.ParentClass parentClass = new MethodComposite2.ParentClass();
        MethodComposite2.ChildClass childClass = new MethodComposite2.ChildClass();
        childClass.setParentClass(parentClass);

        childClass.m1();
        childClass.m2();
        childClass.m3();
    }

    private static void testComposite3() {
        MethodComposite3.ParentClass parentClass = new MethodComposite3.ParentClass();
        MethodComposite3.ChildClass childClass = new MethodComposite3.ChildClass(parentClass);

        childClass.m1();
        childClass.m2();
        childClass.m3();
    }
}
