package com.github.white.interpreter;

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
    protected SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }
}
