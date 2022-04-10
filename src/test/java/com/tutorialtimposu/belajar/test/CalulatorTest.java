package com.tutorialtimposu.belajar.test;

import org.junit.jupiter.api.Test;

public class CalulatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        Integer result = calculator.add(10, 10);
    }
}
