package com.github.white.principle.dip.demo.d2;

/**
 * @author White
 */
public class Email implements Receivable {
    @Override
    public String getInfo() {
        return "电子邮件：Hello, world";
    }
}
