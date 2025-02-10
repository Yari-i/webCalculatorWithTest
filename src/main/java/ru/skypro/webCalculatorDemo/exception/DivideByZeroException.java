package ru.skypro.webCalculatorDemo.exception;

public class DivideByZeroException extends IllegalArgumentException {
    public DivideByZeroException(String s) {
        super(s);
    }
}
