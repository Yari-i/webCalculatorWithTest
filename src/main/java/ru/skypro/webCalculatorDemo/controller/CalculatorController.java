package ru.skypro.webCalculatorDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.webCalculatorDemo.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

        @GetMapping()
        public String printGreeting() {
            return "Добро пожаловать в калькулятор!";
        }

        public String printError() {
            return "Для вычеслений нужно два аргумента!";
        }
        public String printErrorForDivide() {
            return "На ноль делить нельзя!";
        }

        @GetMapping("plus")
        public String plus(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {

            if (num1 == null || num2 == null) {

                return printError();
            }

            int result = calculatorService.plus(num1, num2);
            return num1 + " + " + num2 + " = " + result;
        }

        @GetMapping("minus")
        public String minus(@RequestParam(required = false) Integer num1,
                            @RequestParam(required = false) Integer num2) {

            if (num1 == null || num2 == null) {
                return printError();
            }

            int result = calculatorService.minus(num1, num2);
            return num1 + " - " + num2 + " = " + result;
        }

        @GetMapping("multiply")
        public String multiply(@RequestParam(required = false) Integer num1,
                               @RequestParam(required = false) Integer num2) {

            if (num1 == null || num2 == null) {
                return printError();
            }

            int result = calculatorService.multiply(num1, num2);
            return num1 + " * " + num2 + " = " + result;
        }

        @GetMapping("divide")
        public String divide(@RequestParam(required = false) Integer num1,
                             @RequestParam(required = false) Integer num2) {

            if (num1 == null || num2 == null) {
                return printError();
            }
            if (num2 == 0) {
                return printErrorForDivide();
            }
            int result = calculatorService.divide(num1, num2);
            return num1 + " / " + num2 + " = " + result;
        }
    }

