package com.github.white.interpreter;

import java.util.Map;

/**
 * AbstractExpression: The interface Abstract expression.
 * 抽象表达式，通过 Map 键值对，获取到变量的值
 *
 * @author White
 * @version 1.0
 * @date 2022/08/01 01:03
 */
public interface AbstractExpression {

    /**
     * Interpret int. 解释公式和数值，key 是公式表达式，value 是具体值
     *
     * @param map the map
     * @return the int
     */
    int interpret(Map<String, Integer> map);
}
