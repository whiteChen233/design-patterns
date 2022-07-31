package com.github.white.interpreter;

import java.util.LinkedList;
import java.util.Map;

/**
 * Calculator: The type Calculator.
 *
 * @author White
 * @version 1.0
 * @date 2022/08/01 01:48
 */
public class Calculator {

    /**
     * The Expression.
     */
    private final AbstractExpression expression;

    /**
     * Instantiates a new Calculator.
     *
     * @param expression the expression
     */
    public Calculator(String expression) {
        LinkedList<AbstractExpression> stack = new LinkedList<>();

        char[] arr = expression.toCharArray();

        AbstractExpression left;
        AbstractExpression right;

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case '+':
                    left = stack.pop();
                    right = new VariableExpression(String.valueOf(arr[++i]));
                    stack.push(new AdditionExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VariableExpression(String.valueOf(arr[++i]));
                    stack.push(new SubtractionExpression(left, right));
                    break;
                default:
                    stack.push(new VariableExpression(String.valueOf(arr[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    /**
     * Execute int.
     *
     * @param map the map
     * @return the int
     */
    public int execute(Map<String, Integer> map) {
        return this.expression.interpret(map);
    }
}
