package com.github.white.prototype.v2;

/**
 * The interface Control.
 */
public interface Control {

    /**
     * Gets id.
     *
     * @return the id
     */
    String getId();

    /**
     * Gets name.
     *
     * @return the name
     */
    String getName();

    /**
     * Clone object control.
     *
     * @return the control
     */
    Control cloneObject();
}
