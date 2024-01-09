package com.github.white.builder.v2;

public class AutomaticCarBuilder implements CarBuilder {

    private AutomaticCar car;

    public AutomaticCarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new AutomaticCar();
    }

    @Override
    public void assemblySeats() {
        this.car.setSeats(6);
    }

    @Override
    public void assemblyEngine() {
        this.car.setEngine("电动引擎");
    }

    @Override
    public void assemblyTripComputer() {
        this.car.setTripComputer(true);
    }

    @Override
    public void assemblyGps() {
        this.car.setGps(true);
    }


    public AutomaticCar getCar() {
        return this.car;
    }
}
