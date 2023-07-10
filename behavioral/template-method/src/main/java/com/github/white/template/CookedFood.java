package com.github.white.template;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class CookedFood {

    public CookedFood(String name) {
        GlobalLogger.info("烹饪菜品：{}", name);
    }

}
