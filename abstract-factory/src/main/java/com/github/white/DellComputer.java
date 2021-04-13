package com.github.white;

public class DellComputer implements Computer {

    @Override
    public Mouse getMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new DellKeyboard();
    }
}
