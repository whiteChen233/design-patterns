package com.github.white.builder.v2;

/**
 * The interface Car builder.
 */
public interface CarBuilder {

    /**
     * Reset.
     */
    void reset();

    /**
     * Assembly seats.
     */
    void assemblySeats();

    /**
     * Assembly engine.
     */
    void assemblyEngine();

    /**
     * Assembly trip computer.
     */
    void assemblyTripComputer();

    /**
     * Assembly gps.
     */
    void assemblyGps();
}
