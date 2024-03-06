package com.github.white.singleton;

import org.slf4j.Logger;

public final class Helper {

    private Helper() {}

    public static void logDoSomething(Logger log, Object target) {
        log.info("{}: doSomething", target.getClass().getSimpleName());
    }

    public static void logCreateInstance(Logger log) {
        log.info("Create the Instance");
    }

    public static void logGetInstance(Logger log) {
        log.info("Get the Instance");
    }
}
