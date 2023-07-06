package com.github.white.principle.dip.demo.d2;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class ModernMan {
    /**
     * receive: 有一个接受信息的方法-> Receivable
     */
    public void receive(Receivable receivable) {
        GlobalLogger.info(receivable.getInfo());
    }
}
