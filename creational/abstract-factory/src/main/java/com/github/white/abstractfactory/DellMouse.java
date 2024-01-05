package com.github.white.abstractfactory;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Dell mouse. 具体产品由相应的具体工厂创建。
 */
@Slf4j
public class DellMouse implements Mouse {

    /**
     * Use.
     */
    @Override
    public void use() {
        log.info("使用Dell鼠标");
    }
}
