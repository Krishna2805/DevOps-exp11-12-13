package com.devops.lab;

import static org.junit.jupiter.api.Assertions.*    ;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    Calculator calc = new Calculator();
    
    @Test
    void testadd(){
        assertEquals(5, calc.add(2,2));
    }

    @Test
    void testdivision() {
        assertEquals(2,  calc.divide(10,5));
    }

    @Test
    void testdivisionbyzero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->calc.divide(10,0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}