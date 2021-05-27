package com.github.white.prototype.v2;

import lombok.Data;

/**
 * The type Button.
 */
@Data
public class Button implements Control {

    /**
     * The Id.
     */
    private String id;

    /**
     * The Name.
     */
    private String name;

    /**
     * Instantiates a new Button.
     *
     * @param id   the id
     * @param name the name
     */
    public Button(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Instantiates a new Button.
     *
     * @param source the source
     */
    public Button(Button source) {
        this.id = source.id;
        this.name = source.name;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Clone object control.
     *
     * @return the control
     */
    @Override
    public Control cloneObject() {
        return new Button(this);
    }
}
