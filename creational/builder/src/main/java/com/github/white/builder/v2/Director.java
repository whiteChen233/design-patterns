package com.github.white.builder.v2;

public class Director {

    private CarBuilder builder;

    public Director() {}

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public void createProduct() {
        builder.reset();
        builder.assemblyEngine();
        builder.assemblyTripComputer();
        builder.assemblyGps();
        builder.assemblySeats();
    }
}
