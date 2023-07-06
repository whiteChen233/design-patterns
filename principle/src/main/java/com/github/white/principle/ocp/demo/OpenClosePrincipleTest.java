package com.github.white.principle.ocp.demo;

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
public class OpenClosePrincipleTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        // 如果新增一种图形 需要创建新的图形类继承Shape，然后修改Drawer[使用方]，这里就违背了开闭原则
        OldDrawer oldDrawer = new OldDrawer();
        oldDrawer.drawShape(new OldRectangle());
        oldDrawer.drawShape(new OldCircle());
    }

    private static void test2() {
        // 如果新增一种图形 只需要创建新的图形类实现Shape中的抽象方法，而不用修改Drawer[使用方]，是遵循开闭原则的
        Drawer drawer = new Drawer();
        drawer.drawShape(new Rectangle());
        drawer.drawShape(new Circle());
        drawer.drawShape(new Other());
    }
}

