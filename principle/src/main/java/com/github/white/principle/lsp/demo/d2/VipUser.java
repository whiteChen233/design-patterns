package com.github.white.principle.lsp.demo.d2;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class VipUser extends User {

    public VipUser(int id) {
        super(id);
    }

    @Override
    boolean isVip() {
        return true;
    }
}
