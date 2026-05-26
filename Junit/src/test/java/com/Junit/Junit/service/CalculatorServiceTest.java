package com.Junit.Junit.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {

        int result = calculatorService.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void testMul(){
        int result=calculatorService.mul(2, 3);
        assertEquals(6,result);
    }

    @Test
    void testSub(){
        int result=calculatorService.sub(3,2);
        assertEquals(1,result);
    }

    @Test
    void testdiv(){
        double result=calculatorService.div(6,2);
        assertEquals(3,result);
    }
}
