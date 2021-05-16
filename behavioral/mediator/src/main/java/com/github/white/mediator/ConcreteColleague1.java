package com.github.white.mediator;

import com.github.white.log.GlobalLogger;

/**
 * The type Concrete colleague 1.
 */
public class ConcreteColleague1 extends Colleague {

    /**
     * Receive.
     */
    @Override
    public void receive() {
        GlobalLogger.info("具体同事类1收到请求");
    }

    /**
     * Send.
     */
    @Override
    public void send() {
        GlobalLogger.info("具体同事类1发出请求");
        mediator.relay(this);
    }
}
