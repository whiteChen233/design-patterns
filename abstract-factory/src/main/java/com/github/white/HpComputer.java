package com.github.white;

public class HpComputer implements Computer {

    @Override
    public Mouse getMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new HPKeyboard();
    }
}
