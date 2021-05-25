package com.github.white.builder.v2;

/**
 * The type Car builder.
 */
public class CarBuilder implements Builder {

    /**
     * The Car.
     */
    private Car car;

    /**
     * Instantiates a new Car builder.
     */
    public CarBuilder() {
        this.reset();
    }

    /**
     * Reset.
     */
    @Override
    public void reset() {
        this.car = new Car();
    }

    /**
     * Sets seats.
     *
     * @param number the number
     */
    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    /**
     * Sets engine.
     *
     * @param engine the engine
     */
    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    /**
     * Sets trip computer.
     *
     * @param support the support
     */
    @Override
    public void setTripComputer(boolean support) {
        this.car.setTripComputer(support);
    }

    /**
     * Sets gps.
     *
     * @param support the support
     */
    @Override
    public void setGps(boolean support) {
        this.car.setGps(support);
    }

    /**
     * Gets car.
     *
     * @return the car
     */
    public Car getCar() {
        return this.car;
    }
}
