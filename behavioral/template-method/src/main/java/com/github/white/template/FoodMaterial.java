package com.github.white.template;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class FoodMaterial {

    private final String name;

    public FoodMaterial(String name) {
        this.name = name;
        GlobalLogger.info("购买食材：{}", name);
    }

    public void rinse() {
        GlobalLogger.info("清洗食材：{}", name);
    }

    public String getName() {
        return name;
    }
}
