package com.github.white.principle.ocp;

import org.junit.jupiter.api.Test;

import com.github.white.principle.BasePrincipleTest;
import com.github.white.principle.ocp.demo.d1.OldCircle;
import com.github.white.principle.ocp.demo.d1.OldDrawer;
import com.github.white.principle.ocp.demo.d1.OldRectangle;
import com.github.white.principle.ocp.demo.d2.Circle;
import com.github.white.principle.ocp.demo.d2.Drawer;
import com.github.white.principle.ocp.demo.d2.Other;
import com.github.white.principle.ocp.demo.d2.Rectangle;

/**
 * @author White
 */
class OpenClosePrincipleTest implements BasePrincipleTest {

    @Test
    void test1() {
        execute(() -> {
            // 如果新增一种图形 需要创建新的图形类继承Shape，然后修改Drawer[使用方]，这里就违背了开闭原则
            OldDrawer oldDrawer = new OldDrawer();
            oldDrawer.drawShape(new OldRectangle());
            oldDrawer.drawShape(new OldCircle());
        });
    }

    @Test
    void test2() {
        execute(() -> {
            // 如果新增一种图形 只需要创建新的图形类实现Shape中的抽象方法，而不用修改Drawer[使用方]，是遵循开闭原则的
            Drawer drawer = new Drawer();
            drawer.drawShape(new Rectangle());
            drawer.drawShape(new Circle());
            drawer.drawShape(new Other());
        });
    }
}

