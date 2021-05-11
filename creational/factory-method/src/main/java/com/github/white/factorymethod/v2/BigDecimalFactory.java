package com.github.white.factorymethod.v2;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * The type Big decimal factory.
 */
public class BigDecimalFactory implements NumberFactory {

    /**
     * Parse number.
     *
     * @param str the str
     * @return the number
     */
    @Override
    public Number parse(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        return new BigDecimal(str);
    }
}
