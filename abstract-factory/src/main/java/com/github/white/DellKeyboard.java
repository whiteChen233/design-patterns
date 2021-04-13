package com.github.white;

public class DellKeyboard implements Keyboard {
    @Override
    public void use() {
        GlobalLogger.info("使用Dell键盘");
    }
}
