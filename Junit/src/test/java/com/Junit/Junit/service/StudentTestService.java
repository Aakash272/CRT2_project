package com.Junit.Junit.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.Junit.Junit.service.Marksheet;
import com.Junit.Junit.service.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentTestService {

    @Mock
    private Student student;

    @InjectMocks
    private Marksheet marksheet;

    @Test
    void testPassCase() {

        when(student.getName()).thenReturn("Anil");
        when(student.getMarks()).thenReturn(80);

        String result = marksheet.generateResult();

        assertEquals("Anil is PASS", result);

        verify(student).getMarks();
        verify(student).getName();
    }

    @Test
    void testFailCase() {

        when(student.getName()).thenReturn("Rohit");
        when(student.getMarks()).thenReturn(25);

        String result = marksheet.generateResult();

        assertEquals("Rohit is FAIL", result);

        verify(student).getMarks();
        verify(student).getName();
    }
}