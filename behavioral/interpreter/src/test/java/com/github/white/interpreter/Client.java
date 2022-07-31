package com.github.white.interpreter;

import java.util.HashMap;
import java.util.Map;

import com.github.white.log.GlobalLogger;

public class Client {

    public static void main(String[] args) {
        String expression = "a+b+c";
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 1);
        map.put("c", 1);
        Calculator calc = new Calculator(expression);
        int result = calc.execute(map);
        GlobalLogger.info("expression: {}. result: {}", expression, result);
    }
}