package com.github.white.abstractfactory;

/**
 * The type Dell computer.
 * <p>
 * 具体工厂可生成属于同一变体的系列产品。工厂会确保其创建的产品能相互搭配使用。
 * 具体工厂方法签名会返回一个抽象产品，但在方法内部则会对具体产品进行实例化。
 */
public class DellComputer implements Computer {

    /**
     * Gets mouse.
     *
     * @return the mouse
     */
    @Override
    public Mouse getMouse() {
        return new DellMouse();
    }

    /**
     * Gets keyboard.
     *
     * @return the keyboard
     */
    @Override
    public Keyboard getKeyboard() {
        return new DellKeyboard();
    }
}
