package com.Junit.Junit.service;

import com.Junit.Junit.service.CalculatorService;
import com.Junit.Junit.service.MathService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MathServiceTest {

    @Mock
    CalculatorService calculator;

    @InjectMocks
    MathService mathService;

    @Test
    void testAddNumbers() {

        when(calculator.add(2, 3)).thenReturn(10);


        int result = mathService.addNumbers(2, 3);

        assertEquals(10, result);

        // verify interaction
        verify(calculator, times(1)).add(2, 3);
    }
}