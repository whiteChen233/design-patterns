package com.github.white.builder.v2;

/**
 * The type Car manual builder.
 */
public class CarManualBuilder implements Builder {

    /**
     * The Manual.
     */
    private Manual manual;

    /**
     * Instantiates a new Car manual builder.
     */
    public CarManualBuilder() {
        this.reset();
    }

    /**
     * Reset.
     */
    @Override
    public void reset() {
        this.manual = new Manual();
    }

    /**
     * Sets seats.
     *
     * @param number the number
     */
    @Override
    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    /**
     * Sets engine.
     *
     * @param engine the engine
     */
    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    /**
     * Sets trip computer.
     *
     * @param support the support
     */
    @Override
    public void setTripComputer(boolean support) {
        this.manual.setTripComputer(support);
    }

    /**
     * Sets gps.
     *
     * @param support the support
     */
    @Override
    public void setGps(boolean support) {
        this.manual.setGps(support);
    }

    /**
     * Gets manual.
     *
     * @return the manual
     */
    public Manual getManual() {
        return this.manual;
    }
}
