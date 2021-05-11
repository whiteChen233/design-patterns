package com.github.white.builder.v1;

import lombok.Data;
import lombok.ToString;

/**
 * The type House. 由不同生成器构造的产品无需属于同一类层次结构或接口。
 */
@Data
@ToString
public class House {

    /**
     * The Walls.
     */
    private String walls;

    /**
     * The Doors.
     */
    private String doors;

    /**
     * The Windows.
     */
    private String windows;

    /**
     * The Roof.
     */
    private String roof;
}
