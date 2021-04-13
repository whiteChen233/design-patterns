package com.github.white;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class GlobalLogger {

    private GlobalLogger() {
    }

    private static final Logger LOG = Logger.getGlobal();

    public static void info(String msg, Object... args) {
        LOG.log(Level.INFO, () -> replace(msg, args));
    }

    public static void warn(String msg, Object... args) {
        LOG.log(Level.WARNING, () -> replace(msg, args));
    }

    private static String replace(String msg, Object... args) {
        return Optional.ofNullable(msg).map(i -> Optional.ofNullable(args).map(o -> {
            String t = i.replace("{}", "%s");
            return String.format(t, args);
        }).orElse(i)).orElse("");
    }
}
