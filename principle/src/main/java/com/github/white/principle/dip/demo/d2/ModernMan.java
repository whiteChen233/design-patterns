package com.github.white.principle.dip.demo.d2;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
public class ModernMan {
    /**
     * receive: 有一个接受信息的方法-> Receivable
     */
    public void receive(Receivable receivable) {
        log.info("现代人收到了: {}", receivable.getInfo());
    }
}
