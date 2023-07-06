package com.github.white.principle.dip.demo.d2;

/**
 * @author White
 */
public class Letter implements Receivable {

    @Override
    public String getInfo() {
        return "信件： Hello， world";
    }
}
