package com.github.white.principle.dip.demo.d1;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class PrimitiveMan {
    /**
     * receive: 有一个接受信息的方法-> 原始人用过喊叫传递信息
     */
    public void receive(Shouting shouting) {
        GlobalLogger.info(shouting.getInfo());
    }
}
