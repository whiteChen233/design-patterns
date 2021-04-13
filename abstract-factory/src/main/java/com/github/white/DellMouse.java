package com.github.white;

public class DellMouse implements Mouse {
    @Override
    public void use() {
        GlobalLogger.info("使用Dell鼠标");
    }
}
