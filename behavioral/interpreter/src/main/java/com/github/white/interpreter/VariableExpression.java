package com.github.white.interpreter;

import java.util.Map;

/**
 * VariableExpression: The type Variable expression. 变量解释器
 *
 * @author White
 * @version 1.0
 * @date 2022/08/01 01:07
 */
public class VariableExpression implements AbstractExpression {

    /**
     * The Var.
     */
    private final String key;

    /**
     * Instantiates a new Variable expression.
     *
     * @param key the key
     */
    public VariableExpression(String key) {
        this.key = key;
    }

    /**
     * Interpret int. 通过变量名获取值
     *
     * @param map the map
     * @return the int
     */
    @Override
    public int interpret(Map<String, Integer> map) {
        return map.get(this.key);
    }
}
