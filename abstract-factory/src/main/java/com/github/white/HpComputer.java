package com.github.white;

/**
 * The type Hp computer.
 * 每个具体工厂中都会包含一个相应的产品变体。
 */
public class HpComputer implements Computer {

    /**
     * Gets mouse.
     *
     * @return the mouse
     */
    @Override
    public Mouse getMouse() {
        return new HpMouse();
    }

    /**
     * Gets keyboard.
     *
     * @return the keyboard
     */
    @Override
    public Keyboard getKeyboard() {
        return new HPKeyboard();
    }
}
