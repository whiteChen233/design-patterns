package com.github.white.facede;

import com.github.white.log.GlobalLogger;

/**
 * The type Computer. 电脑中的每一个部件相当于一个子系统，而电脑相当于对这些子系统做了统一的对外接口，
 */
public class Computer {

    /**
     * The Cpu.
     */
    private final Cpu cpu;

    /**
     * The Memory.
     */
    private final Memory memory;

    /**
     * The Disk.
     */
    private final Disk disk;

    /**
     * Instantiates a new Computer.
     */
    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    /**
     * Boot up.
     */
    public void bootUp() {
        GlobalLogger.info("bootUp computer ...");
        cpu.startUp();
        memory.startUp();
        disk.startUp();
        GlobalLogger.info("bootUp computer finished.");
    }

    /**
     * Shut down.
     */
    public void shutDown() {
        GlobalLogger.info("shutDown computer ...");
        cpu.shutDown();
        memory.shutDown();
        disk.shutDown();
        GlobalLogger.info("shutDown computer finished.");
    }
}
