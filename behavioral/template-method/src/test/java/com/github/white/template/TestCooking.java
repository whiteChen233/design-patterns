package com.github.white.template;


public class TestCooking {
    public static void main(String[] args) {
        test1();
    }
    private static void test1() {
        Cooking szechuanChicken = new SzechuanChicken();
        szechuanChicken.cooking();

        Cooking noodlesInSoupWithPork = new NoodlesInSoupWithPork();
        noodlesInSoupWithPork.cooking();
    }
}
