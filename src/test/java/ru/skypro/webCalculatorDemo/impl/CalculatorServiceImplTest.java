package ru.skypro.webCalculatorDemo.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.skypro.webCalculatorDemo.exception.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void plus() {

        int num1 = 10;
        int num2 = 10;
        int num3 = 5;
        int num4 = 5;

        int expectedResult1 = 20;
        int expectedResult2 = 10;


        Integer actualResult1 = calculatorService.plus(num1, num2);
        Integer actualResult2 = calculatorService.plus(num3, num4);

        Assertions.assertEquals(expectedResult1, actualResult1);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void minus() {

        int num1 = 10;
        int num2 = 10;
        int num3 = 5;
        int num4 = 4;
        int expectedResult1 = 0;
        int expectedResult2 = 1;

        Integer actualResult1 = calculatorService.minus(num1, num2);
        Integer actualResult2 = calculatorService.minus(num3, num4);

        Assertions.assertEquals(expectedResult1, actualResult1);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void multiply() {

        int num1 = 10;
        int num2 = 10;
        int num3 = 5;
        int num4 = 5;
        int expectedResult1 = 100;
        int expectedResult2 = 25;


        Integer actualResult1 = calculatorService.multiply(num1, num2);
        Integer actualResult2 = calculatorService.multiply(num3, num4);

        Assertions.assertEquals(expectedResult1, actualResult1);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void divide() {

        int num1 = 10;
        int num2 = 10;
        int num3 = 20;
        int num4 = 2;
        int expectedResult1 = 1;
        int expectedResult2 = 10;


        Integer actualResult1 = calculatorService.divide(num1, num2);
        Integer actualResult2 = calculatorService.divide(num3, num4);

        Assertions.assertEquals(expectedResult1, actualResult1);
        Assertions.assertEquals(expectedResult2, actualResult2);

    }

    @Test
    void shouldThrowExceptionForDivideByZero() {

        int num1 = 10;
        int num2 = 0;
        int expectedResult = 20;

        Assertions.assertThrows(DivideByZeroException.class,
                () -> calculatorService.divide(num1, num2));
    }
}