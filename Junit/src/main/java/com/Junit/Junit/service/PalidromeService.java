package com.Junit.Junit.service;


import org.springframework.stereotype.Service;

@Service
public class PalidromeService {

    public boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);
    }


}
