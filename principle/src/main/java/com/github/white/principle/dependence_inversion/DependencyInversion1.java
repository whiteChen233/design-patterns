package com.github.white.principle.dependence_inversion;

import com.github.white.log.GlobalLogger;

/**
 * The type Dependencynversion.
 *
 * 给Person提供接受消息(Email)的功能
 */
public class DependencyInversion1 {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Email());
    }
}


/**
 * The type Person.
 * 问题：如果接受的对象是微信、qq、短信等，则需要新增类，同时Person也需要新增相应的接受方法
 * 解决：把所有接受的消息看成是可接受的对象(Receivable),Person接受这个这个对象，而不同的消息子需要实现这个接口就可以了，这就是依赖倒转原则
 */
class Person {
    /**
     * 有一个接受信息的方法-> Email
     *
     * @param email the email
     */
    public void receive(Email email) {
        GlobalLogger.info(email.getInfo());
    }
}

/**
 * The type Email.
 */
class Email {
    /**
     * Gets info.
     *
     * @return the info
     */
    public String getInfo() {
        return "电子邮件信息：Hello, world";
    }
}