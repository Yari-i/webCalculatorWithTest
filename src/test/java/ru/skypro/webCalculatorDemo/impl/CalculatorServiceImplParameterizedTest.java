package ru.skypro.webCalculatorDemo.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private static Stream<Arguments> argumentProvider() {
        return Stream.of(
                Arguments.of(10, 20),
                Arguments.of(15, 10),
                Arguments.of(10, 1),
                Arguments.of(20, 20)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void plus(int num1, int num2) {

        int expectedResult = num1 + num2;


        Integer actualResult = calculatorService.plus(num1, num2);


        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void minus(int num1, int num2) {

        int expectedResult = num1 - num2;


        Integer actualResult = calculatorService.minus(num1, num2);


        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void multiply(int num1, int num2) {

        int expectedResult = num1 * num2;


        Integer actualResult = calculatorService.multiply(num1, num2);


        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void divide(int num1, int num2) {

        int expectedResult = num1 / num2;


        Integer actualResult = calculatorService.divide(num1, num2);


        Assertions.assertEquals(expectedResult, actualResult);

    }

}
