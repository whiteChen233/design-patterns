package com.github.white.principle.dip.demo;

import com.github.white.principle.dip.demo.d1.PrimitiveMan;
import com.github.white.principle.dip.demo.d1.Shouting;
import com.github.white.principle.dip.demo.d2.Email;
import com.github.white.principle.dip.demo.d2.ModernMan;
import com.github.white.principle.dip.demo.d2.Letter;


/**
 * @author White
 */
public class DependencyInversionPrincipleTest {

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        /*
         问题：如果接受的对象是微信、qq、短信等，则需要新增类，同时Person也需要新增相应的接受方法
         解决：把所有接受的消息看成是可接受的对象(Receivable),Person接受这个这个对象，而不同的消息子需要实现这个接口就可以了，这就是依赖倒转原则
         */
        PrimitiveMan p = new PrimitiveMan();
        p.receive(new Shouting());
    }

    private static void test2() {
        ModernMan p = new ModernMan();
        p.receive(new Email());
        p.receive(new Letter());
    }
}


