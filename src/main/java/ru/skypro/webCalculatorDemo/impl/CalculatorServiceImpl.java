package ru.skypro.webCalculatorDemo.impl;

import org.springframework.stereotype.Service;
import ru.skypro.webCalculatorDemo.exception.DivideByZeroException;
import ru.skypro.webCalculatorDemo.exception.NotEnoughArgumentsException;
import ru.skypro.webCalculatorDemo.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgumentsException("Для вычесления нужно два аргумента!");
        }
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgumentsException("Для вычесления нужно два аргумента!");
        }
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgumentsException("Для вычесления нужно два аргумента!");
        }
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgumentsException("Для вычесления нужно два аргумента!");
        }
        if (num2 == 0) {
            throw new DivideByZeroException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }

}


