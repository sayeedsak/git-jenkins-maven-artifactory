package com.example;

public class Calculator {
    private final MathOperations operations = new MathOperations();

    public int add(int a, int b) {
        return operations.add(a, b);
    }

    public int subtract(int a, int b) {
        return operations.subtract(a, b);
    }
}

