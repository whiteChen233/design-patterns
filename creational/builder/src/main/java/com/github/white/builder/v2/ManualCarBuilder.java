package com.github.white.builder.v2;

public class ManualCarBuilder implements CarBuilder {

    private ManualCar manual;

    public ManualCarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new ManualCar();
    }

    @Override
    public void assemblySeats() {
        this.manual.setSeats(4);
    }

    @Override
    public void assemblyEngine() {
        this.manual.setEngine("机械引擎");
    }

    @Override
    public void assemblyTripComputer() {
        this.manual.setTripComputer(false);
    }

    @Override
    public void assemblyGps() {
        this.manual.setGps(true);
    }

    public ManualCar getManual() {
        return this.manual;
    }
}
