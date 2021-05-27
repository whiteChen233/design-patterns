package com.github.white.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

import com.github.white.prototype.v1.Circle;
import com.github.white.prototype.v1.Rectangle;
import com.github.white.prototype.v1.Shape;
import com.github.white.prototype.v2.Button;
import com.github.white.prototype.v2.ControlRegister;

/**
 * The type Test prototype.
 */
public class TestPrototype {

    /**
     * Test v 1.
     */
    @Test
    public void testV1() {
        Map<String, List<Shape>> shapes = new HashMap<>();
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(20);
        shapes.computeIfAbsent("circle", k -> new ArrayList<>()).add(circle);

        Circle anotherCircle = circle.cloneShape();
        shapes.computeIfAbsent("anotherCircle", k -> new ArrayList<>()).add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(10);
        shapes.computeIfAbsent("rectangle", k -> new ArrayList<>()).add(rectangle);

        shapes.forEach((k, v) -> v.add(v.get(0).cloneShape()));

        Assert.assertTrue(shapes.entrySet().stream().noneMatch(i -> i.getValue().get(0) == i.getValue().get(1)));
    }

    /**
     * Test v 2.
     */
    @Test
    public void testV2() {
        ControlRegister controlRegister = new ControlRegister();

        Button b1 = new Button("btn1", "b1");

        Button b2 = (Button) b1.cloneObject();
        b2.setId("btn2");
        b2.setName("b2");

        controlRegister.addItem(b1);
        controlRegister.addItem(b2);

        Button b1Tmp = (Button) controlRegister.getById("btn1");
        Button b2Tmp = (Button) controlRegister.getByName("btn2");

        Assert.assertTrue(Stream.of(b1Tmp, b2Tmp).anyMatch(Objects::nonNull));
    }
}
