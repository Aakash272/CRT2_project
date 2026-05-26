package com.Junit.Junit.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

public class Student {

    public String getName() {
        return "Default";
    }

    public int getMarks() {
        return 0;
    }

}
