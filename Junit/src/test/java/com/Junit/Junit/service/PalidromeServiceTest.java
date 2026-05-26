package com.Junit.Junit.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PalidromeServiceTest {

    PalidromeService palidromeService = new PalidromeService();

    @Test
    void palidrometrue(){
        boolean result=palidromeService.isPalindrome("Madam");
        assertEquals(true,result);
    }
    @Test
    void palidromefalse(){
        boolean result=palidromeService.isPalindrome("Shree");
        assertEquals(false,result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "level", "noon"})
    void testPalindrome(String word) {

        assertTrue(palidromeService.isPalindrome(word));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ahsijr", "ahbhss", "ajbdhjeb", "abhdb"})
    void testPalindrome2(String word) {

        assertFalse(palidromeService.isPalindrome(word));
    }
}
