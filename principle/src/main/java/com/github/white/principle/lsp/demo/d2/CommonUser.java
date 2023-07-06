package com.github.white.principle.lsp.demo.d2;

/**
 * @author White
 */
public class CommonUser extends User {

    public CommonUser(int id) {
        super(id);
    }

    @Override
    boolean isVip() {
        return false;
    }
}
