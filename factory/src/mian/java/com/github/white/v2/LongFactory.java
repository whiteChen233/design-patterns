package com.github.white.v2;

import java.util.Objects;

/**
 * The type Long factory.
 */
public class LongFactory implements NumberFactory {

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
        return new Long(str);
    }
}
