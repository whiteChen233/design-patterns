package com.github.white.principle.dependence_inversion;

import com.github.white.log.GlobalLogger;

/**
 * The type Dependencynversion.
 * <p>
 * 给Person提供接受消息的功能
 */
public class DependencyInversion2 {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.receive(new Email2());
        p.receive(new QqMessage());
    }
}


/**
 * The type Person.
 */
class Person2 {
    /**
     * 有一个接受信息的方法-> Email
     *
     * @param receivable the receivable
     */
    public void receive(Receivable receivable) {
        GlobalLogger.info(receivable.getInfo());
    }
}

/**
 * The type Email.
 */
class Email2 implements Receivable {
    /**
     * Gets info.
     *
     * @return the info
     */
    @Override
    public String getInfo() {
        return "电子邮件信息：Hello, world";
    }
}

/**
 * The type Qq message.
 */
class QqMessage implements Receivable {

    /**
     * Gets info.
     *
     * @return the info
     */
    @Override
    public String getInfo() {
        return "QQ 消息： Hello， world";
    }
}

/**
 * The interface Receivable.
 */
interface Receivable {
    /**
     * Gets info.
     *
     * @return the info
     */
    String getInfo();
}