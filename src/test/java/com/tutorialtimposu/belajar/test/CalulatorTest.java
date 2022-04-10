package com.tutorialtimposu.belajar.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalulatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        Integer result = calculator.add(10, 10);

        // cara ini ribet
//        if (result != 20) {
//            throw new RuntimeException("test gagal");
//        }

        // cara yang direkomendasikan
        assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.devide(100, 0);
        });
    }
}
