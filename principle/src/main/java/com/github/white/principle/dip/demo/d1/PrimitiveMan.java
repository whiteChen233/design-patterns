package com.github.white.principle.dip.demo.d1;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class PrimitiveMan {
    /**
     * receive: 有一个接受信息的方法-> 原始人用过喊叫传递信息
     */
    public void receive(Shouting shouting) {
        log.info("原始人收到了: {}", shouting.getInfo());
    }
}
