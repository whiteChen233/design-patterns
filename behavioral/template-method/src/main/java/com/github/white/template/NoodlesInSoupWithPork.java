package com.github.white.template;

import java.util.ArrayList;
import java.util.List;

/**
 * @author White
 */
public class NoodlesInSoupWithPork extends Cooking {
    @Override
    public List<FoodMaterial> buy() {
        List<FoodMaterial> list = new ArrayList<>();
        list.add(new FoodMaterial("猪肉"));
        list.add(new FoodMaterial("面条"));
        return list;
    }

    @Override
    public void doCook(List<FoodMaterial> list) {
        new CookedFood("肉丝汤面");
    }

    @Override
    public String[] noNeedRinse() {
        return new String[] {"面条"};
    }
}
