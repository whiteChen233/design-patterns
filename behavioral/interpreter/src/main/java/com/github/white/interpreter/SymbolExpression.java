package com.github.white.interpreter;

import java.util.Map;

import lombok.Data;

/**
 * SymbolExpression: The type Symbol expression. 抽象运算符解释器 每个运算符都只跟自己左右两个数字有关，但左右两个数字也有可能是一个计息的记过，无论哪种类型，都是 AbstractExpression 的子类
 *
 * @author White
 * @version 1.0
 * @date 2022/08/01 01:10
 */
@Data
public abstract class SymbolExpression implements AbstractExpression {

    /**
     * The Left.
     */
    private final AbstractExpression left;
    /**
     * The Right.
     */
    private final AbstractExpression right;

    /**
     * Instantiates a new Symbol expression.
     *
     * @param left  the left
     * @param right the right
     */
    public SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Interpret int. SymbolExpression 需要子类实现 这里是默认实现
     *
     * @param map the map
     * @return the int
     */
    public abstract int interpret(Map<String, Integer> map);
}
