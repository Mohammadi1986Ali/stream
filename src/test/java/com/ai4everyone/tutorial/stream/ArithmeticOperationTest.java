package com.ai4everyone.tutorial.stream;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ArithmeticOperationTest {
    @ParameterizedTest
    @CsvSource({
            "10, 5, ADD, 15",
            "10, 5, SUBTRACT, 5",
            "10, 5, MULTIPLY, 50",
            "10, 5, DIVIDE, 2"
    })
    void givenInputAndOperation_whenCalculating_thenResultShouldBeCorrect(Integer number1,
                                                                          Integer number2,
                                                                          ArithmeticOperationType operationType,
                                                                          int expectedResult) {
        log.info("number1: {}, number2: {}, operationType: {}, expectedResult: {}", number1, number2, operationType, expectedResult);
        var result = ArithmeticOperation.calculate(number1, number2, operationType);
        assertEquals(expectedResult, result);
    }
}