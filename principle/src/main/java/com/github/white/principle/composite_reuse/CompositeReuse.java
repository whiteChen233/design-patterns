package com.github.white.principle.composite_reuse;

public class CompositeReuse {

    public static void main(String[] args) {

    }
}

class Case1 {
    // A中有m1，m2两个方法
    class A {
        public void m1() {}
        public void m2() {}
    }

    // B通过继承A来拥有m1，m2两个方法
    // 但是如果A后续添加了新的方法  则B也会同时拥有
    class B extends A {
    }
}

class Case2 {
    class A {
        public void m1() {}
        public void m2() {}
    }

    // 通过向方法中传入A的引用来调用A中定义的方法
    class B {
        public void m1(A a) {
            a.m1();
        }
        public void m2(A a) {
            a.m2();
        }
    }
}

class Case3 {
    class A {
        public void m1() {}
        public void m2() {}
    }

    // 在B中定义一个A的成员变量，通过setter方法注入
    class B {
        A a;
        public void setA(A a) {
            this.a = a;
        }
    }
}

class Case4 {
    class A {
        public void m1() {}
        public void m2() {}
    }

    // 在B中定义一个A的成员变量，并直接new出来
    class B {
        A a = new A();
    }
}
