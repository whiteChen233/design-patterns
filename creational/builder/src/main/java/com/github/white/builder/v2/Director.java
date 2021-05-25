package com.github.white.builder.v2;

/**
 * The type Director.
 */
public class Director {

    /**
     * The Builder.
     */
    private Builder builder;

    /**
     * Instantiates a new Director.
     */
    public Director() {}

    /**
     * Instantiates a new Director.
     *
     * @param builder the builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * Sets builder.
     *
     * @param builder the builder
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * Create product.
     */
    public void createProduct() {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("引擎");
        builder.setTripComputer(true);
        builder.setGps(true);
    }
}
