package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }
}

