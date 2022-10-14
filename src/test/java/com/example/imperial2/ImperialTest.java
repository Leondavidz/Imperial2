package com.example.imperial2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImperialTest {
    ImperialCalculator exp = new ImperialCalculator();

    @Test
    void gram(){
        double a =1;
        double expectedResult = 28.35;
        double result = exp.gram(a);
        assertEquals(expectedResult,result);
    }

    @Test
    void kilogram(){
        double a =1;
        double expectedResult =6.35;
        double result = exp.kilogram(a);
        assertEquals(expectedResult,result);
    }
}
