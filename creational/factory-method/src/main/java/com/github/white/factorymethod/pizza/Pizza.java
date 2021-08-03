package com.github.white.factorymethod.pizza;

import com.github.white.log.GlobalLogger;

/**
 * The type Pizza.
 */
public abstract class Pizza {

    /**
     * The Name.
     */
    private final String name;

    /**
     * Instantiates a new Pizza.
     *
     * @param name the name
     */
    Pizza(String name) {
        this.name = name;
    }

    /**
     * Prepare.
     */
    public abstract void prepare();

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Bake.
     */
    public void bake() {
        GlobalLogger.info("烘烤{}", getName());
    }

    /**
     * Cut.
     */
    public void cut() {
        GlobalLogger.info("给{}切块", getName());
    }

    /**
     * Box.
     */
    public void box() {
        GlobalLogger.info("给{}装盒", getName());
    }
}
