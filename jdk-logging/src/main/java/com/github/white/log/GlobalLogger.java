package com.github.white.log;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The type Global logger.
 */
public final class GlobalLogger {

    /**
     * Instantiates a new Global logger.
     */
    private GlobalLogger() {
    }

    /**
     * The constant LOG.
     */
    private static final Logger LOG = Logger.getGlobal();

    /**
     * Info.
     *
     * @param msg  the msg
     * @param args the args
     */
    public static void info(String msg, Object... args) {
        LOG.log(Level.INFO, () -> replace(msg, args));
    }

    /**
     * Warn.
     *
     * @param msg  the msg
     * @param args the args
     */
    public static void warn(String msg, Object... args) {
        LOG.log(Level.WARNING, () -> replace(msg, args));
    }

    /**
     * Replace string.
     *
     * @param msg  the msg
     * @param args the args
     * @return the string
     */
    private static String replace(String msg, Object... args) {
        return Optional.ofNullable(msg).map(i -> Optional.ofNullable(args).map(o -> {
            String t = i.replace("{}", "%s");
            return String.format(t, args);
        }).orElse(i)).orElse("");
    }
}
