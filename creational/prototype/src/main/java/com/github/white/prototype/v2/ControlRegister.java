package com.github.white.prototype.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Control register. 原型注册表 （Prototype Registry） 提供了一种访问常用原型的简单方法， 其中存储了一系列可供随时复制的预生成对象。
 * 最简单的注册表原型是一个 名称 → 原型的哈希表。 但如果需要使用名称以外的条件进行搜索， 你可以创建更加完善的注册表版本。
 */
public class ControlRegister {

    /**
     * The Controls.
     */
    List<Control> controls;

    /**
     * Instantiates a new Control register.
     */
    public ControlRegister() {
        controls = new ArrayList<>();
    }

    /**
     * Add item.
     *
     * @param control the control
     */
    public void addItem(Control control) {
        this.controls.add(control);
    }

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public Control getById(String id) {
        return this.controls.stream().filter(i -> i.getId().equals(id)).findFirst().orElse(null);
    }

    /**
     * Gets by name.
     *
     * @param name the name
     * @return the by name
     */
    public Control getByName(String name) {
        return this.controls.stream().filter(i -> i.getName().equals(name)).findFirst().orElse(null);
    }
}
