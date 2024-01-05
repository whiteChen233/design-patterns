package com.github.white.abstractfactory;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Hp mouse.
 */
@Slf4j
public class HpMouse implements Mouse {

    /**
     * Use.
     */
    @Override
    public void use() {
        log.info("使用Hp鼠标");
    }
}
