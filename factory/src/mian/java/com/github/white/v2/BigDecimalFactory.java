package com.github.white.v2;

import java.math.BigDecimal;
import java.util.Objects;

public class BigDecimalFactory implements NumberFactory {

    @Override
    public Number parse(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        return new BigDecimal(str);
    }
}
