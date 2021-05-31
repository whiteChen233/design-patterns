package com.github.white.proxy.v1;

import com.github.white.log.GlobalLogger;

/**
 * The type Proxy.
 */
public class Proxy implements Subject {

    /**
     * The Subject.
     */
    private final RealSubject subject;

    /**
     * Instantiates a new Proxy.
     *
     * @param subject the subject
     */
    public Proxy(RealSubject subject) {
        this.subject = subject;
    }

    /**
     * Operate.
     */
    @Override
    public void operate() {
        this.preOperate();
        subject.operate();
        this.postOperate();
    }

    /**
     * Pre operate.
     */
    public void preOperate() {
        GlobalLogger.info("访问真实主题之前的预处理");
    }

    /**
     * Post operate.
     */
    public void postOperate() {
        GlobalLogger.info("访问真实主题之后的后续处理");
    }

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public RealSubject getSubject() {
        return this.subject;
    }
}
