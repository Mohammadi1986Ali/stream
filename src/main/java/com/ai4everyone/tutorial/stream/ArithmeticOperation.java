package com.ai4everyone.tutorial.stream;

import java.util.Map;
import java.util.function.BiFunction;

public class ArithmeticOperation {
    private static final Map<ArithmeticOperationType, BiFunction<Integer, Integer, Integer>> ARITHMETIC_OPERATION = Map.of(
            ArithmeticOperationType.ADD, (number1, number2) -> number1 + number2,
            ArithmeticOperationType.SUBTRACT, (number1, number2) -> number1 - number2,
            ArithmeticOperationType.MULTIPLY, (number1, number2) -> number1 * number2,
            ArithmeticOperationType.DIVIDE, (number1, number2) -> number1 / number2
    );

    public static int calculate(Integer number1, Integer number2, ArithmeticOperationType operationType) {
        if (operationType == null) {
            throw new IllegalArgumentException("Unsupported operationType");
        }
        return ARITHMETIC_OPERATION.get(operationType).apply(number1, number2);
    }
}
