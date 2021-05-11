package com.github.white.factorymethod.v2;

/**
 * The interface Number factory. 
 */
public interface NumberFactory {

    /**
     * Parse number.
     *
     * @param str the str
     * @return the number
     */
    Number parse(String str);
}
