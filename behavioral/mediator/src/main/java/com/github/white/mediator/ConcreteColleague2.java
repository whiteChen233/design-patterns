package com.github.white.mediator;

import com.github.white.log.GlobalLogger;

/**
 * The type Concrete colleague 2.
 */
public class ConcreteColleague2 extends Colleague {

    /**
     * Receive.
     */
    @Override
    public void receive() {
        GlobalLogger.info("具体同事类2收到请求");
    }

    /**
     * Send.
     */
    @Override
    public void send() {
        GlobalLogger.info("具体同事类2发出请求");
        mediator.relay(this);
    }
}
