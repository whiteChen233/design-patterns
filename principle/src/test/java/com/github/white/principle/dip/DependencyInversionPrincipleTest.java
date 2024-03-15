package com.github.white.principle.dip;

import org.junit.jupiter.api.Test;

import com.github.white.principle.BasePrincipleTest;
import com.github.white.principle.dip.demo.d1.PrimitiveMan;
import com.github.white.principle.dip.demo.d1.Shouting;
import com.github.white.principle.dip.demo.d2.Email;
import com.github.white.principle.dip.demo.d2.ModernMan;
import com.github.white.principle.dip.demo.d2.Letter;


/**
 * @author White
 */
class DependencyInversionPrincipleTest implements BasePrincipleTest {

    @Test
    void test1() {
        /*
         问题：如果接受的对象是微信、qq、短信等，则需要新增类，同时Person也需要新增相应的接受方法
         解决：把所有接受的消息看成是可接受的对象(Receivable),Person接受这个这个对象，而不同的消息子需要实现这个接口就可以了，这就是依赖倒转原则
         */
        execute(() -> {
            PrimitiveMan p = new PrimitiveMan();
            p.receive(new Shouting());
        });
    }

    @Test
    void test2() {
        execute(() -> {
            ModernMan p = new ModernMan();
            p.receive(new Email());
            p.receive(new Letter());
        });
    }
}


