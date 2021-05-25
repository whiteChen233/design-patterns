package com.github.white.builder.v2;

/**
 * The interface Builder.  声明构造一辆车需要做哪些事情
 */
public interface Builder {

    /**
     * Reset.
     */
    void reset();

    /**
     * Sets seats.
     *
     * @param number the number
     */
    void setSeats(int number);

    /**
     * Sets engine.
     *
     * @param engine the engine
     */
    void setEngine(String engine);

    /**
     * Sets trip computer.
     *
     * @param support the support
     */
    void setTripComputer(boolean support);

    /**
     * Sets gps.
     *
     * @param support the support
     */
    void setGps(boolean support);
}
