package com.github.white.principle.ocp.demo.d1;

import com.github.white.log.GlobalLogger;

/**
 * @author White
 */
public class OldDrawer {

    public void drawShape(OldShape s) {
        if (s.getType() == 1) {
            drawRectangle();
        }
        if (s.getType() == 2) {
            drawCircle();
        }
    }

    private void drawRectangle() {
        GlobalLogger.info("画矩形");
    }

    private void drawCircle() {
        GlobalLogger.info("画圆形");
    }
}
