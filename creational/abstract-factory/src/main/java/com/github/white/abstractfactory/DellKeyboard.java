package com.github.white.abstractfactory;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Dell keyboard.
 */
@Slf4j
public class DellKeyboard implements Keyboard {

    /**
     * Use.
     */
    @Override
    public void use() {
        log.info("使用Dell键盘");
    }
}
