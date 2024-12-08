package ru.skypro.webCalculatorDemo.exception;

public class NotEnoughArgumentsException extends IllegalArgumentException{
    public NotEnoughArgumentsException(String s) {
        super(s);
    }
}
