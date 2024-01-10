package com.github.white.factorymethod.pizza;


import lombok.extern.slf4j.Slf4j;

/**
 * The type Pizza.
 */
public interface Pizza {

    /**
     * Prepare.
     */
    void prepare();

    /**
     * Gets name.
     *
     * @return the name
     */
    String getName();

    /**
     * Bake.
     */
    default void bake() {
        Log.log.info("烘烤{}", this.getName());
    }

    /**
     * Cut.
     */
    default void cut() {
        Log.log.info("给{}切块", this.getName());
    }

    /**
     * Box.
     */
    default void box() {
        Log.log.info("给{}装盒", this.getName());
    }

    @Slf4j
    class Log {}
}
