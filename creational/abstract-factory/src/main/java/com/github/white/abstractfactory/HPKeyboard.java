package com.github.white.abstractfactory;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Hp keyboard.
 */
@Slf4j
public class HPKeyboard implements Keyboard {

    /**
     * Use.
     */
    @Override
    public void use() {
        log.info("使用Hp键盘");
    }
}
