package com.github.white.template;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public abstract class Cooking {

    public final void cooking() {
        List<FoodMaterial> foodMaterials = this.buy();
        this.rinse(foodMaterials);
        this.doCook(foodMaterials);
    }

    abstract List<FoodMaterial> buy();

    public void rinse(List<FoodMaterial> list) {
        List<String> l = Stream.of(noNeedRinse()).collect(Collectors.toList());
        list.forEach(i -> {
            if (!l.contains(i.getName())) {
                i.rinse();
            } else  {
                GlobalLogger.info("{}不需要清洗", i.getName());
            }
        });
    }

    abstract void doCook(List<FoodMaterial> list);

    public String[] noNeedRinse() {
        return new String[]{};
    }
}
