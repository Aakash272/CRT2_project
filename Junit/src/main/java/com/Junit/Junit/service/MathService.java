package com.Junit.Junit.service;

public class MathService {

    private CalculatorService calculator;

    public MathService(CalculatorService calculator) {
        this.calculator = calculator;
    }

    public int addNumbers(int a, int b) {
        return calculator.add(a, b);
    }
}