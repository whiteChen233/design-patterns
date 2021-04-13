package com.github.white;

public class Demo {

    public static void main(String[] args) {
        Computer dell = new DellComputer();
        dell.getKeyboard().use();
        dell.getMouse().use();

        Computer hp = new HpComputer();
        hp.getKeyboard().use();
        hp.getMouse().use();
    }
}
