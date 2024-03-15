package com.github.white.principle.ocp.demo.d1;


import lombok.extern.slf4j.Slf4j;

/**
 * @author White
 */
@Slf4j
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
        log.info("画矩形");
    }

    private void drawCircle() {
        log.info("画圆形");
    }
}
