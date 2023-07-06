package com.github.white.principle.lsp.demo.d2;

import lombok.Data;

/**
 * @author White
 */
@Data
public abstract class User {
    private final int id;

    abstract boolean isVip();
}
