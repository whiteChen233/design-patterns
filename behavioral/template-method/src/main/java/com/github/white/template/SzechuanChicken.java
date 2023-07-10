package com.github.white.template;

import java.util.ArrayList;
import java.util.List;

/**
 * @author White
 */
public class SzechuanChicken extends Cooking {
    @Override
    public List<FoodMaterial> buy() {
        List<FoodMaterial> list = new ArrayList<>();
        list.add(new FoodMaterial("鸡肉"));
        list.add(new FoodMaterial("辣椒"));
        return list;
    }

    @Override
    public void doCook(List<FoodMaterial> list) {
        new CookedFood("四川炒鸡球");
    }
}
