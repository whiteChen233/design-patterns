package com.github.white.v2;

import java.util.Objects;

public class LongFactory implements NumberFactory {

    @Override
    public Number parse(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        return new Long(str);
    }
}
