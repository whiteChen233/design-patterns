package com.github.white.prototype.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The type Rectangle.  具体原型。克隆的方法会创建一个新对象并将其传递给构造函数。
 * 直到构造行数运行完成前，它都拥有指向新克隆对象的引用。因此，任何人都无法访问未完全生成的克隆对象。这可以保持克隆结果的一致性。
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Rectangle extends Shape {

    /**
     * The Width.
     */
    private int width;

    /**
     * The Length.
     */
    private int length;

    /**
     * Instantiates a new Rectangle.
     */
    public Rectangle() {
    }

    /**
     * Instantiates a new Rectangle.
     *
     * @param source the source
     */
    public Rectangle(Rectangle source) {
        // 需要调用父构造函数来复制父类中定义的私有成员变量。
        super(source);
        this.width = source.width;
        this.length = source.length;
    }

    /**
     * Clone shape shape.
     *
     * @return the shape
     */
    @Override
    public Shape cloneShape() {
        return new Rectangle(this);
    }
}
